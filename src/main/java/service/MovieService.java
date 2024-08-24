package service;

import DAO.CrudDao;
import entity.Movie;

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
    public void delete(Movie movie){
        movieDao.delete(movie);
    }
}
