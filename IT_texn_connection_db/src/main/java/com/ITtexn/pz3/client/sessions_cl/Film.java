
package com.ITtexn.pz3.client.sessions_cl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for film complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="film">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filmDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://session.service.pz3.ITtexn.com/}genre" minOccurs="0"/>
 *         &lt;element name="id_film" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "description12",
    "director",
    "filmDuration",
    "genre",
    "idFilm",
    "language",
    "title"
})
public class Film {

    protected String description12;
    protected String director;
    protected String filmDuration;
    @XmlSchemaType(name = "string")
    protected Genre genre;
    @XmlElement(name = "id_film")
    protected int idFilm;
    protected String language;
    protected String title;

    public Film(String description12, String director, String filmDuration, Genre genre, int idFilm, String language, String title) {
        this.description12 = description12;
        this.director = director;
        this.filmDuration = filmDuration;
        this.genre = genre;
        this.idFilm = idFilm;
        this.language = language;
        this.title = title;
    }

    public Film(){

    }

    @Override
    public String toString() {
        return "Film{" +
                "description12='" + description12 + '\'' +
                ", director='" + director + '\'' +
                ", filmDuration='" + filmDuration + '\'' +
                ", genre=" + genre +
                ", idFilm=" + idFilm +
                ", language='" + language + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    /**
     * Gets the value of the description12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription12() {
        return description12;
    }

    /**
     * Sets the value of the description12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription12(String value) {
        this.description12 = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the filmDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilmDuration() {
        return filmDuration;
    }

    /**
     * Sets the value of the filmDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilmDuration(String value) {
        this.filmDuration = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenre(Genre value) {
        this.genre = value;
    }

    /**
     * Gets the value of the idFilm property.
     * 
     */
    public int getIdFilm() {
        return idFilm;
    }

    /**
     * Sets the value of the idFilm property.
     * 
     */
    public void setIdFilm(int value) {
        this.idFilm = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
