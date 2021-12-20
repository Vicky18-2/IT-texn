package com.ITtexn.pz3.database.client;

import com.ITtexn.pz3.client.film_cl.FilmService;
import com.ITtexn.pz3.database.service.film.FilmServiceHibernateImp;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.net.MalformedURLException;
import java.net.URL;

public class conn {
    public static void main(String[] args) throws MalformedURLException {

        SessionFactory sessionFactory;
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//
//        URL urlFilm = new URL("http://localhost:7777/film?wsdl");
//        FilmServiceHibernateImpService filmServiceImplementService = new FilmServiceHibernateImpService(urlFilm);
//        FilmService filmServiceProxy = (FilmService) filmServiceImplementService.getFilmServiceHibernateImpPort();
//
//        System.out.println(new FilmServiceHibernateImp(sessionFactory).getAllFilms());
    }
}
