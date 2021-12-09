package com.ITtexn.pz3.client;


import com.ITtexn.pz3.client.film_cl.Film;
import com.ITtexn.pz3.client.film_cl.FilmService;
import com.ITtexn.pz3.client.film_cl.FilmServiceImplementService;

import java.net.URL;
import java.util.ArrayList;


public class Connection {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7777/film?wsdl");
        FilmServiceImplementService filmServiceImplementService = new FilmServiceImplementService(url);
        FilmService filmServiceProxy = filmServiceImplementService.getFilmServiceImplementPort();

        ArrayList<Film> allFilms = (ArrayList<Film>) filmServiceProxy.getAllFilms();
        System.out.println(allFilms);
        ArrayList<String> dir = new ArrayList<>();
        dir.add("Director");
        filmServiceProxy.insertFilm(5, "FFF", dir, "01:11:11", "String", "ty", "Tyy");
        System.out.println(filmServiceProxy.getAllFilms());


    }


}
