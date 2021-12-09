package com.ITtexn.pz3.service.film;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface FilmService {

    @WebMethod
    Film getFilm(int id_film);

    @WebMethod
    Film updateFilm(int id_film,String title, List<String> director, String filmDuration, String description, String genre, String language );

    @WebMethod
    Film deleteFilm(int id_film);

    @WebMethod
    void insertFilm(int id_film,String title, List<String> director,String filmDuration, String description, String genre, String language);

    @WebMethod
    List<Film> getAllFilms();

    @WebMethod
    int countFilms();
}
