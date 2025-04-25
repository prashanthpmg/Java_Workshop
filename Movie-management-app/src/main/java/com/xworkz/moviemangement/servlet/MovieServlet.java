package com.xworkz.moviemangement.servlet;


import com.xworkz.moviemangement.entity.MovieEntity;
import com.xworkz.moviemangement.repo.MovieRepo;
import com.xworkz.moviemangement.repo.MovieRepoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/save")
public class MovieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MovieEntity entity=new MovieEntity();
        entity.setMovie_name(req.getParameter("movie_name"));
        entity.setMovie_language(req.getParameter("movie_language"));
        entity.setMovie_hero(req.getParameter("movie_hero"));
        entity.setMovie_heroine(req.getParameter("movie_heroine"));
        entity.setMovie_releasedate(LocalDate.parse(req.getParameter("movie_releasedate")));

        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);

        PrintWriter Write=resp.getWriter();
        Write.print(entity.getMovie_name()+": Movie Saved..!");
    }
}
