import entity.Movie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MovieService;

import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    private MovieService movieService;
    private SimpleDateFormat sdf;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        sdf = new SimpleDateFormat("dd-MM-yyyy");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddAndFindMovie() throws Exception {

//        Movie movie = new Movie();
//        movie.setMovieId("MOV123");
//        movie.setActor("Test Actor");
//        movie.setDirector("Test Director");
//        movie.setDuration(120.0);
//        movie.setFromDate(sdf.parse("01-01-2024"));
//        movie.setToDate(sdf.parse("01-02-2024"));
//

//        movieService.addMovie(movie);


        Movie foundMovie = movieService.getMovieById("MOV123");
        assertNotNull(foundMovie);
        assertEquals("Test Director", foundMovie.getDirector());
    }

    @Test
    void testUpdateMovie() throws Exception {

        Movie movie = new Movie();
        movie.setMovieId("MOV124");
        movie.setActor("Test Actor 2");
        movie.setDirector("Test Director 2");
        movie.setDuration(130.0);
        movie.setFromDate(sdf.parse("01-03-2024"));
        movie.setToDate(sdf.parse("01-04-2024"));


        movieService.addMovie(movie);


        movie.setDirector("binh pham");
        movieService.updateMovie(movie);


        Movie updatedMovie = movieService.getMovieById("MOV124");
        assertNotNull(updatedMovie);
        assertEquals("binh pham", updatedMovie.getDirector());
    }

    @Test
    void testDeleteMovie() {

        Movie movie = new Movie();
        movie.setMovieId("MOV125");
        movie.setDirector("director 3");


        movieService.addMovie(movie);


        movieService.delete(movieService.getMovieById("MOV125"));

        Movie deletedMovie = movieService.getMovieById("MOV125");
        assertNull(deletedMovie);
    }

    @Test
    void testGetAllMovies() {
        List<Movie> movies = movieService.movies();
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
    }

    @Test
    void testSearchMoviesByDateRange() throws Exception {

//        Movie movie = new Movie();
//        movie.setMovieId("MOV126");
//        movie.setDirector("The Dark Knight");
//        movie.setFromDate(sdf.parse("01-01-2024"));
//        movie.setToDate(sdf.parse("31-01-2024"));
//        movieService.addMovie(movie);


        List<Movie> movies = movieService.searchMoviesByDateRange(sdf.parse("20-01-2024"), sdf.parse("15-02-2024"));
        assertNotNull(movies);

        // Debugging assertion failure
        System.out.println("Movies found: " + movies);

        assertTrue(movies.stream().anyMatch(m -> m.getMovieId().equals("MOV125")));
    }
}
