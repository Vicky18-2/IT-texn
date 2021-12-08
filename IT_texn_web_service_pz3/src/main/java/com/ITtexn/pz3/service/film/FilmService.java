package com.ITtexn.pz3.service.film;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface FilmService {

    @WebMethod
    Film getFilm(int id);

    @WebMethod
    Film updateFilm(int id,String name, String filmDuration, String description, String genre, String language );

    @WebMethod
    Film deleteFilm(int id);

    @WebMethod
    Film insertFilm(int id,String name, String filmDuration, String description, String genre, String language);

    @WebMethod
    List<Film> getAllFilms();

    @WebMethod
    int countFilms();
}
