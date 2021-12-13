package com.ITtexn.pz3.client;


import com.ITtexn.pz3.client.film_cl.*;
import com.ITtexn.pz3.client.hall_cl.Hall;
import com.ITtexn.pz3.client.hall_cl.HallService;
import com.ITtexn.pz3.client.hall_cl.HallServiceImplementService;
import com.ITtexn.pz3.client.sessions_cl.SessionService;
import com.ITtexn.pz3.client.sessions_cl.SessionServiceImplementService;


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

        URL urlSession = new URL("http://localhost:7777/session?wsdl");
        SessionServiceImplementService sessionServiceImplementService = new SessionServiceImplementService(urlSession);
        SessionService sessionService= sessionServiceImplementService.getSessionServiceImplementPort();


        com.ITtexn.pz3.client.sessions_cl.Hall hall= new com.ITtexn.pz3.client.sessions_cl.Hall(2,"3D",3,4);
        com.ITtexn.pz3.client.sessions_cl.Film film = new com.ITtexn.pz3.client.sessions_cl.Film("description12", dir, "filmDuration", com.ITtexn.pz3.client.sessions_cl.Genre.fromValue("COMEDY"),9, "ru", "tit");
        sessionService.insertSession(2,"20-10-2000","02:02:02",hall,film);
        System.out.println(sessionService.getAllSessions());
        sessionService.updateSession(2,"20-10-3030","02:02:02",hall,film);
        System.out.println(sessionService.getAllSessions());
        sessionService.deleteSession(2);
        System.out.println(sessionService.countSession());

    }


}
