
package com.ITtexn.pz3.service.film;

import com.ITtexn.pz3.service.genre.Genre;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film  {

    @Column(name="title")
    protected String title;

    @Column(name="director")
    protected String director;

    @Column(name="filmDuration")
    protected String filmDuration;

    @Column(name="description")
    protected String description;

    @Column(name="language")
    protected String language;

    @Id
    protected int id_film;

    @Column(name="genre")
    @Enumerated(EnumType.STRING)
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
                ", description='" + description + '\'' +
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
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

    public Film(int id_film, String title, String director, String filmDuration, String description, Genre genre, String language){
        this.id_film = id_film;
        this.title = title;
        this.director = director;
        this.filmDuration=filmDuration;
        this.description = description;
        this.genre=genre;
        this.language=language;

    }

}
