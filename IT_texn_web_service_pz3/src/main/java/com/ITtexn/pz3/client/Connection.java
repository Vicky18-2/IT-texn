package com.ITtexn.pz3.client;

import com.ITtexn.pz3.client.film_cl.Film;
import com.ITtexn.pz3.client.film_cl.FilmService;
import com.ITtexn.pz3.client.film_cl.FilmServiceImplementService;

import java.net.URL;
import java.util.List;

public class Connection  {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7777/film?wsdl");
        FilmServiceImplementService filmServiceImplementService = new FilmServiceImplementService(url);
        FilmService filmServiceProxy= filmServiceImplementService.getFilmServiceImplementPort();

        List<Film> allFilms = filmServiceProxy.getAllFilms();
    }


}
