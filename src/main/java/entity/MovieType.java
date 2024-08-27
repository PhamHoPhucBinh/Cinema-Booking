package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie_type")
public class MovieType {
    @EmbeddedId
    private MovieTypeId movieTypeId;

    @ManyToOne
    @MapsId("typeId")
    @JoinColumn(name = "TYPE_ID", nullable = false, referencedColumnName = "type_id")
    private Type type;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "MOVIE_ID", nullable = false, referencedColumnName = "movie_id")
    private Movie movie;

    @Column(name = "MT_DESCRIPTION")
    private String mtDescription;

    public MovieType() {
    }

    public MovieType(Type type, Movie movie, String mtDescription) {
        this.type = type;
        this.movie = movie;
        this.mtDescription = mtDescription;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getMtDescription() {
        return mtDescription;
    }

    public void setMtDescription(String mtDescription) {
        this.mtDescription = mtDescription;
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "type=" + type +
                ", movie=" + movie +
                ", mtDescription='" + mtDescription + '\'' +
                '}';
    }

    public MovieTypeId getMovieTypeId() {
        return movieTypeId;
    }

    public void setMovieTypeId(MovieTypeId movieTypeId) {
        this.movieTypeId = movieTypeId;
    }
}
