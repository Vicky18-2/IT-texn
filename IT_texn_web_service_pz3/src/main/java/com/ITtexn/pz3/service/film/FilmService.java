package com.ITtexn.pz3.service.film;

import com.ITtexn.pz3.service.genre.Genre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface FilmService {

    @WebMethod
    void getFilm(int id_film);

    @WebMethod
    void updateFilm(int id_film,String title, List<String> director, String filmDuration, String description, Genre genre, String language );

    @WebMethod
    void deleteFilm(int id_film);

    @WebMethod
    void insertFilm(int id_film, String title, List<String> director, String filmDuration, String description, Genre genre, String language);

    @WebMethod
    List<Film> getAllFilms();

    @WebMethod
    int countFilms();
}
