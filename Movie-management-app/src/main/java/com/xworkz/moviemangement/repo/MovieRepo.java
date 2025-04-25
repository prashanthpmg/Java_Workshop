package com.xworkz.moviemangement.repo;

import com.xworkz.moviemangement.entity.MovieEntity;

public interface MovieRepo {
    void saveMovie(MovieEntity entity);

    void readMovies();

}
