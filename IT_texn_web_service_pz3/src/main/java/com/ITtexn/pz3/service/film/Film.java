
package com.ITtexn.pz3.service.film;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class Film  {

//    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "token")
    protected String title;
//    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "token")
    protected List<String> director;
//    @XmlElement(name = "film_duration", namespace = "http://nure/it-texn/pz", required = true)
//    @XmlSchemaType(name = "string")
    protected String filmDuration;
//    @XmlElement(namespace = "http://nure/it-texn/pz")
    protected String description;
//    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "token")
    protected String genre;
//    @XmlElement(namespace = "http://nure/it-texn/pz")
    protected String language;

    public int getId() {
        return id;
    }

    protected int id;


    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public void setDirector(List<String> director) {
        this.director = director;
    }

    public List<String> getDirector() {
        if (director == null) {
            director = new ArrayList<String>();
        }
        return this.director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", filmDuration='" + filmDuration + '\'' +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", language=" + language +
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String value) {
        this.genre = value;
    }

    public Object getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public Film(){

    };

    public Film(int id, String title, String filmDuration, String description, String genre, String language){
        this.id = id;
        this.title = title;
        this.filmDuration=filmDuration;
        this.description = description;
        this.genre=genre;
        this.language=language;

    }

}
