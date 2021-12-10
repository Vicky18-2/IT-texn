package com.ITtexn.pz3.client;


import com.ITtexn.pz3.client.film_cl.FilmService;
import com.ITtexn.pz3.client.film_cl.FilmServiceImplementService;
import com.ITtexn.pz3.client.film_cl.Genre;
import com.ITtexn.pz3.client.hall_cl.HallService;
import com.ITtexn.pz3.client.hall_cl.HallServiceImplementService;


import java.net.URL;
import java.util.ArrayList;


public class Connection {
    public static void main(String[] args) throws Exception {
        URL urlFilm = new URL("http://localhost:7777/film?wsdl");
        FilmServiceImplementService filmServiceImplementService = new FilmServiceImplementService(urlFilm);
        FilmService filmServiceProxy = filmServiceImplementService.getFilmServiceImplementPort();

        ArrayList<String> dir = new ArrayList<>();
        dir.add("Director");
        filmServiceProxy.insertFilm(5, "FFF", dir, "01:11:11", "String", Genre.fromValue("COMEDY"), "Tyy");
        System.out.println(filmServiceProxy.getAllFilms());
        filmServiceProxy.updateFilm(5, "UPDATE11", dir, "01:11:11", "String", Genre.fromValue("MYSTERY"), "Tyy");
        System.out.println(filmServiceProxy.getAllFilms());
        filmServiceProxy.deleteFilm(5);
        System.out.println(filmServiceProxy.getAllFilms());
        System.out.println(filmServiceProxy.countFilms());

        URL urlHall = new URL("http://localhost:7777/hall?wsdl");
        HallServiceImplementService hallServiceImplementService = new HallServiceImplementService(urlHall);
        HallService hallService= hallServiceImplementService.getHallServiceImplementPort();

//        ArrayList<Hall> allHalls = (ArrayList<Hall>) hallService.getAllHalls();
//        System.out.println(allHalls);

        hallService.insertHall(2,"3D",3,4);
        System.out.println(hallService.getAllHalls());
        hallService.updateHall(1,"5D",1,1);
        System.out.println(hallService.getAllHalls());
        hallService.deleteHall(2);
        System.out.println(hallService.countHall());



    }


}
