package com.ITtexn.pz3.service.film;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.inject.Inject;


@WebService(endpointInterface = "com.ITtexn.pz3.service.film.FilmService")

public class FilmServiceImplement implements FilmService {

    @Inject
    protected FilmCreation filmCreation;

    @WebMethod
    public Film getFilm(int id) {
        return filmCreation.getFilm(id);
    }

    @WebMethod
    public Film updateFilm(int id, String title, String filmDuration, String description, String genre, String language) {
        return filmCreation.updateFilm(id,title,filmDuration,description,genre,language);
    }

    @WebMethod
    public Film deleteFilm(int id) {
        return filmCreation.deleteFilm(id);
    }

    @WebMethod
    public Film insertFilm(int id, String title, String filmDuration, String description, String genre, String language) {
        return filmCreation.insertFilm(id,title,filmDuration,description,genre,language);
    }

    @WebMethod
    public List<Film> getAllFilms() {
        return filmCreation.getAllFilmList();
    }

    @WebMethod
    public int countFilms() {
        return filmCreation.count();
    }

}
