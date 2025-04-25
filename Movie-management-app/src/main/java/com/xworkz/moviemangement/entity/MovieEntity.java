package com.xworkz.moviemangement.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class MovieEntity {

    //movie_id int PK
    //movie_name varchar(45)
    //movie_language varchar(45)
    //movie_hero varchar(45)
    //movie_heroine varchar(45)
    //movie_releasedate date
    private  int movieId;
    private String movie_name;
    private String movie_language;
    private String movie_hero;
    private String movie_heroine;
    private LocalDate movie_releasedate;


}
