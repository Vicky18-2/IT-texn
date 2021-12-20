package com.ITtexn.pz3.service;

import com.ITtexn.pz3.database.service.film.FilmServiceHibernateImp;
import com.ITtexn.pz3.service.genre.Genre;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactorym {

    public static void main(String[] args) {


        SessionFactory sessionFactory;
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        List<Film> result = session.createQuery("from Film", Film.class).list();
//
//        System.out.println(result);
//        session.getTransaction().commit();
//        session.close();

        System.out.println(new FilmServiceHibernateImp(sessionFactory).getAllFilms());
        System.out.println(new FilmServiceHibernateImp(sessionFactory).getFilm(1));
        System.out.println(new FilmServiceHibernateImp(sessionFactory).countFilms());
        System.out.println(new FilmServiceHibernateImp(sessionFactory).insertFilm(2,"Deutschland","Rammstein","01:01:01","descruo",
                Genre.COMEDY,"ru"));
        //System.out.println(new FilmServiceHibernateImp(sessionFactory).deleteFilm(1));
    }

}


