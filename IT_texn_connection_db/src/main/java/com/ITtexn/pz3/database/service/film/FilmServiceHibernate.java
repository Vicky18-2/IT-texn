package com.ITtexn.pz3.database.service.film;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.genre.Genre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface FilmServiceHibernate {


        @WebMethod
        List<Film> getFilm(int id_film);

        @WebMethod
        void updateFilm(int id_film, String title, String director, String filmDuration, String description, Genre genre, String language );

        @WebMethod
        int deleteFilm(int id_film);

        @WebMethod
        int insertFilm(int id_film, String title, String director, String filmDuration, String description, Genre genre, String language);

        @WebMethod
        List<Film> getAllFilms();

        @WebMethod
        long countFilms();

    }


