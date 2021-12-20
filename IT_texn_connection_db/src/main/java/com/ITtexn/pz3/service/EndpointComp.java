package com.ITtexn.pz3.service;

import com.ITtexn.pz3.database.service.film.FilmServiceHibernateImp;
import com.ITtexn.pz3.service.hall.HallServiceImplement;
import com.ITtexn.pz3.service.session.SessionServiceImplement;
import com.ITtexn.pz3.service.ticket.TicketServiceImplement;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.xml.ws.Endpoint;

public class EndpointComp {

    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        SessionFactory sessionFactory;
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Endpoint EndpointFilm = Endpoint.publish("http://localhost:7777/film", new FilmServiceHibernateImp(sessionFactory));
        Endpoint EndpointHall = Endpoint.publish("http://localhost:7777/hall", new HallServiceImplement());
        Endpoint endpointSession = Endpoint.publish("http://localhost:7777/session", new SessionServiceImplement());
        Endpoint endpointTicket = Endpoint.publish("http://localhost:7777/ticket", new TicketServiceImplement());

//        FilmServiceImplement film = new FilmServiceImplement();
//        FilmCreation createFilm = new FilmCreation();
//
//
//        // film.insertFilm(2, "Dom","11:11:11","ddd","Comedy","ru");
//        System.out.println(film.getFilm(1));;

    }
}
