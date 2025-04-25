package com.xworkz.moviemangement;

import com.xworkz.moviemangement.entity.MovieEntity;
import com.xworkz.moviemangement.repo.MovieRepo;
import com.xworkz.moviemangement.repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args) {

        MovieEntity movieEntity=new MovieEntity();
        //movieEntity.setMovieId(2);
        movieEntity.setMovie_name("Mungaru Male");
        movieEntity.setMovie_hero("Ganesh");
        movieEntity.setMovie_heroine("Pooja Gandhi");
        movieEntity.setMovie_language("Kannada");
        movieEntity.setMovie_releasedate(LocalDate.of(2007,5,24));


        MovieRepo repo=new MovieRepoImpl();

        repo.readMovies();
    }
}

