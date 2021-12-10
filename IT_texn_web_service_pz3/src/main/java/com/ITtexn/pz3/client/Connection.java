package com.ITtexn.pz3.client;


import com.ITtexn.pz3.client.film_cl.FilmService;
import com.ITtexn.pz3.client.film_cl.FilmServiceImplementService;

import java.net.URL;
import java.util.ArrayList;


public class Connection {
    public static void main(String[] args) throws Exception {
        URL urlFilm = new URL("http://localhost:7777/film?wsdl");
        FilmServiceImplementService filmServiceImplementService = new FilmServiceImplementService(urlFilm);
        FilmService filmServiceProxy = filmServiceImplementService.getFilmServiceImplementPort();

        //  ArrayList<Film> allFilms = (ArrayList<Film>) filmServiceProxy.getAllFilms();
       // System.out.println(allFilms);
        ArrayList<String> dir = new ArrayList<>();
        dir.add("Director");
        filmServiceProxy.insertFilm(5, "FFF", dir, "01:11:11", "String", "COMEDY", "Tyy");
        System.out.println(filmServiceProxy.getAllFilms());
        filmServiceProxy.updateFilm(5, "UPDATE11", dir, "01:11:11", "String", "MYSTERY", "Tyy");
        System.out.println(filmServiceProxy.getAllFilms());
        filmServiceProxy.deleteFilm(5);
        System.out.println(filmServiceProxy.getAllFilms());
        System.out.println(filmServiceProxy.countFilms());
////
//        URL urlHall = new URL("http://localhost:7777/hall?wsdl");
//        HallServiceImplementService hallServiceImplementService = new HallServiceImplementService(urlHall);
//        HallService hallService= hallServiceImplementService.getHallServiceImplementPort();
//
//        ArrayList<Hall> allHalls = (ArrayList<Hall>) hallService.getAllHalls();
//        System.out.println(allHalls);

    }


}
