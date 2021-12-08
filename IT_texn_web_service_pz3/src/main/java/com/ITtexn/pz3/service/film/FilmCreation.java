package com.ITtexn.pz3.service.film;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmCreation extends Film {

    private List<Film> filmList;

    public List<Film> getAllFilmList() {
        return filmList;
    }

    public FilmCreation() {
//        filmList = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            id = in.nextInt();
//            title = in.next();
//            filmDuration = in.next();
//            description = in.next();
//            genre = in.next();
//            language = in.next();
//            filmList.add(new Film(id, title, filmDuration, description, genre, language));
//        }

        filmList = new ArrayList<>();
        filmList.add(new Film(1, "Title", "01:01:01", "description", "Comedy", "RU"));


    }

    public Film getFilm(int id) {
        for (Film film : filmList) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public Film updateFilm(int id, String name, String filmDuration, String description, String genre, String language) {
        for (Film film : filmList) {
            if (film.getId() == id) {
                film.setTitle(title);
                film.setLanguage(language);
                film.setFilmDuration(filmDuration);
                film.setDirector(director);
                film.setDescription(description);
                film.setGenre(genre);
            }
        }
        return null;
    }

    public Film insertFilm(int id, String name, String filmDuration, String description, String genre, String language){
        Film film= new Film(id, title, filmDuration, description, genre, language);
        filmList.add(film);
        return film;
    }

    public Film deleteFilm(int id){
        for(Film film: filmList){
            if(film.getId() == id){
                filmList.remove(film);
            }
        }
        return null;
    }

    public int count() {
        return filmList.size();
    }

}
