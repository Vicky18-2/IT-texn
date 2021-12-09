package com.ITtexn.pz3.service;

import com.ITtexn.pz3.service.film.FilmCreation;
import com.ITtexn.pz3.service.film.FilmService;
import com.ITtexn.pz3.service.film.FilmServiceImplement;

import javax.xml.ws.Endpoint;

public class EndpointComp {

    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        Endpoint filmEndpoint = Endpoint.publish("http://localhost:7777/film",new FilmServiceImplement());

//        FilmServiceImplement film = new FilmServiceImplement();
//        FilmCreation createFilm = new FilmCreation();
//
//
//        // film.insertFilm(2, "Dom","11:11:11","ddd","Comedy","ru");
//        System.out.println(film.getFilm(1));;

    }
}
