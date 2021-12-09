package com.ITtexn.pz3.service.film;

import java.util.ArrayList;
import java.util.List;

public class FilmCreation extends Film {

    private List<Film> filmList;

    public List<Film> getAllFilmList() {
        return filmList;
    }

    public FilmCreation() {
        filmList = new ArrayList<>();
        List<String> dirList= new ArrayList<>();
        dirList.add("dir");
        filmList.add(new Film(1, "Title",dirList, "01:01:01", "description", "Comedy", "RU"));
    }

    public Film getFilm(int id_film) {
        for (Film film : filmList) {
            if (film.getId_film() == id_film) {
                return film;
            }
        }
        return null;
    }

    public Film updateFilm(int id_film, String title,List<String> director, String filmDuration, String description, String genre, String language) {
        for (Film film : filmList) {
            if (film.getId_film() == id_film) {
                film.setTitle(title);
                film.setLanguage(language);
                film.setFilmDuration(filmDuration);
                film.setDirector(director);
                film.setDescription12(description);
                film.setGenre(genre);
            }
        }
        return null;
    }

    public void insertFilm(int id_film, String title, List<String> director, String filmDuration, String description, String genre, String language){
        Film film= new Film(id_film, title, director,filmDuration, description, genre, language);
        filmList.add(film);
    }

    public Film deleteFilm(int id_film){
        for(Film film: filmList){
            if(film.getId_film() == id_film){
                filmList.remove(film);
            }
        }
        return null;
    }

    public int count() {
        return filmList.size();
    }

}
