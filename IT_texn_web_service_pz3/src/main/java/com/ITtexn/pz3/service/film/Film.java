
package com.ITtexn.pz3.service.film;

import com.ITtexn.pz3.service.genre.Genre;

import java.util.ArrayList;
import java.util.List;


public class Film  {


    protected String title;

    protected String director;

    protected String filmDuration;

    protected String description12;

    protected String language;

    protected int id_film;

    protected Genre genre;



    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    public int getId_film() {
        return id_film;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", filmDuration='" + filmDuration + '\'' +
                ", description='" + description12 + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", id=" + id_film +
                '}';
    }

    public String getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(String value) {
        this.filmDuration = value;
    }

    public String getDescription12() {
        return description12;
    }

    public void setDescription12(String value) {
        this.description12 = value;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre value) {
        this.genre = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public Film(){

    };

    public Film(int id_film, String title, String director, String filmDuration, String description12, Genre genre, String language){
        this.id_film = id_film;
        this.title = title;
        this.director = director;
        this.filmDuration=filmDuration;
        this.description12 = description12;
        this.genre=genre;
        this.language=language;

    }

}
