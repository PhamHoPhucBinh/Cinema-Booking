package service;

import DAO.CrudDao;
import Utility.HibernateUtil;
import entity.Movie;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class MovieService {
    private CrudDao<Movie, String> movieDao;

    public MovieService() {
        this.movieDao = new CrudDao<>(Movie.class);
    }

    public void addMovie(Movie movie) {
        movieDao.save(movie);
    }

    public Movie getMovieById(String movieId) {
        return movieDao.findById(movieId);
    }

    public List<Movie> movies() {
        return movieDao.findAll();
    }

    public void updateMovie(Movie movie) {
        movieDao.update(movie);
    }

    public void delete(Movie movie) {
        movieDao.delete(movie);
    }

    public List<Movie> searchMoviesByDateRange(Date fromDate, Date toDate) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM Movie m WHERE m.fromDate <= :toDate AND m.toDate >= :fromDate";
            Query<Movie> query = session.createQuery(hql, Movie.class);
            query.setParameter("fromDate", fromDate);
            query.setParameter("toDate", toDate);
            List<Movie> movies = query.list();

            // Debugging output
            for (Movie movie : movies) {
                System.out.println("Found Movie: " + movie.getMovieId() + ", From Date: " + movie.getFromDate() + ", To Date: " + movie.getToDate());
            }

            return movies;
        }
    }

}
