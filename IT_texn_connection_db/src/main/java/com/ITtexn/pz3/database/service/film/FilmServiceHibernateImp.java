package com.ITtexn.pz3.database.service.film;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.genre.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ITtexn.pz3.database.service.film.FilmServiceHibernate")
public class FilmServiceHibernateImp implements FilmServiceHibernate {

    SessionFactory sessionFactory;

    public FilmServiceHibernateImp(){}

    public FilmServiceHibernateImp(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @WebMethod
    @Override
    public List<Film> getFilm(int id_film) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String hqlGetFilmById = "from Film where id_film=:id_film";

        List getFilmById = session.createQuery(hqlGetFilmById).setString("id_film",String.valueOf(id_film)).list();
        session.getTransaction().commit();
        session.close();
        return  getFilmById;

    }

    @WebMethod
    @Override
    public void updateFilm(int id_film, String title, String director, String filmDuration, String description, Genre genre, String language) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String hqlUpdate = "update Customer c set c.name = :newName where c.name = :oldName";
//// or String hqlUpdate = "update Customer set name = :newName where name = :oldName";
//        int updatedEntities = s.createQuery( hqlUpdate )
//                .setString( "newName", newName )
//                .setString( "oldName", oldName )
//                .executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//        return result;
    }

    @WebMethod
    @Override
    public int deleteFilm(int id_film) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String hqlDelete = "delete Film where id_film=:id_film";
        int deleteEntities = session.createQuery(hqlDelete).setString("id_film", String.valueOf(id_film)).executeUpdate();

        session.getTransaction().commit();
        session.close();
        return deleteEntities;
    }

    @WebMethod
    @Override
    public int insertFilm(int id_film, String title, String director, String filmDuration, String description, Genre genre, String language) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String hqlInsert = "insert into Film (id_film, title, director,filmDuration,description,genre,language) select Film.id_film, Film.title, Film.director, Film.filmDuration, Film.description, Film.genre, Film.language from Film where id_film=:id_film and title=:title and director=:director and filmDuration=:filmDuration and description=:description and genre=:genre and language=:language";
        int createdEntities = session.createQuery(hqlInsert).setString("id_film",String.valueOf(id_film)).setString("title",title).setString("director",director).setString("filmDuration",String.valueOf(filmDuration)).setString("description",description).setString("genre",String.valueOf(genre)).setString("language",String.valueOf(language)).executeUpdate();

        session.getTransaction().commit();
        session.close();
        return createdEntities;
    }

    @WebMethod
    @Override
    public List<Film> getAllFilms() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Film> result = session.createQuery("from Film", Film.class).list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @WebMethod
    @Override
    public long countFilms() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        long count = (long)session.createQuery("SELECT COUNT(f) FROM Film f").getSingleResult();
        session.getTransaction().commit();
        session.close();
        return count;
    }
}
