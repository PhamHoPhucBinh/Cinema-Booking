package service;

import DAO.CrudDao;
import entity.MovieType;
import entity.MovieTypeId;

import java.util.List;

public class MovieTypeService {
    private CrudDao<MovieType, MovieTypeId> movieTypeDao;

    public MovieTypeService() {
        this.movieTypeDao = new CrudDao<>(MovieType.class);
    }

    public void addMovieType(MovieType movieType) {
        movieTypeDao.save(movieType);
    }

    public MovieType findMovieTypeById(MovieTypeId movieTypeId) {
        return movieTypeDao.findById(movieTypeId);
    }

    public List<MovieType> getAllMovieTypes() {
        return movieTypeDao.findAll();
    }

    public void updateMovieType(MovieType movieType) {
        movieTypeDao.update(movieType);
    }

    public void deleteMovieType(MovieTypeId movieTypeId) {
        MovieType movieType = findMovieTypeById(movieTypeId);
        if (movieType != null) {
            movieTypeDao.delete(movieType);
        }
    }
}
