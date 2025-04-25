package com.xworkz.moviemangement.repo;

import com.xworkz.moviemangement.entity.MovieEntity;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public void saveMovie(MovieEntity entity){
    String urls="jdbc:mysql://localhost:3306/moviedata";
    String username="root";
    String psw="Prashupmg";
        //movie_id int PK
        //movie_name varchar(45)
        //movie_language varchar(45)
        //movie_hero varchar(45)
        //movie_heroine varchar(45)
        //movie_releasedate date
        String query="Insert into movie_info(movie_id,movie_name,movie_language,movie_hero,movie_heroine,movie_releasedate)"+"values(?,?,?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //translator of JDBC
            Connection connection =DriverManager.getConnection(urls,username,psw);
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setInt(1,entity.getMovieId());
            statement.setString(2,entity.getMovie_name());
            statement.setString(3,entity.getMovie_language());
            statement.setString(4,entity.getMovie_hero());
            statement.setString(5, entity.getMovie_heroine());
            statement.setDate(6, Date.valueOf(entity.getMovie_releasedate()));

            statement.execute();
            System.out.println(entity.getMovie_name()+" Data is saved");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
            catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void readMovies(){
        String urls="jdbc:mysql://localhost:3306/moviedata";
        String username="root";
        String psw="Prashupmg";

        String query ="select * from movie_info";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //translator of JDBC
            Connection connection =DriverManager.getConnection(urls,username,psw);
            PreparedStatement statement= connection.prepareStatement(query);
            ResultSet set=statement.executeQuery();
            while (set.next()){
               // movie_id, movie_name, movie_language, movie_hero, movie_heroine, movie_releasedate
                System.out.println(set.getInt("movie_id"));
                System.out.println(set.getString("movie_name"));
                System.out.println(set.getString("movie_language"));
                System.out.println(set.getString("movie_hero"));
                System.out.println(set.getString("movie_heroine"));


            }
            System.out.println();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


