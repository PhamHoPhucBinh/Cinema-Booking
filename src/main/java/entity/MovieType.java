package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie_type")
public class MovieType implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "TYPE_ID", nullable = false)
    private Type type;

    @Id
    @ManyToOne
    @JoinColumn(name = "MOVIE_ID", nullable = false)
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
}
