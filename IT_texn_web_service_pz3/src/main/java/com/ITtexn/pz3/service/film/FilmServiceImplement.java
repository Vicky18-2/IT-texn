package com.ITtexn.pz3.service.film;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.inject.Inject;


@WebService(endpointInterface = "com.ITtexn.pz3.service.film.FilmService")

public class FilmServiceImplement implements FilmService {

    @Inject
    protected FilmCreation filmCreation;

    public FilmServiceImplement() {
        this.filmCreation = new FilmCreation();
    }

    @WebMethod
    public Film getFilm(int id_film) {
        return filmCreation.getFilm(id_film);
    }

    @WebMethod
    public Film updateFilm(int id_film, String title,List<String> director, String filmDuration, String description, String genre, String language) {
        return filmCreation.updateFilm(id_film,title,director,filmDuration,description,genre,language);
    }

    @WebMethod
    public Film deleteFilm(int id_film) {
        return filmCreation.deleteFilm(id_film);
    }

    @WebMethod
    public void insertFilm(int id_film, String title, List<String> director,String filmDuration, String description, String genre, String language) {
         filmCreation.insertFilm(id_film,title,director,filmDuration,description,genre,language);
    }

    @WebMethod
    @Override
    public List<Film> getAllFilms() {
        return filmCreation.getAllFilmList();
    }

    @WebMethod
    public int countFilms() {
        return filmCreation.count();
    }

}
