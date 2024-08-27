package entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Movie {
    @Id
    @Column(name = "MOVIE_ID", length = 10)
    private String movieId;

    @Column(name = "ACTOR")
    private String actor;

    @Column(name = "DIRECTOR")
    private String director;

    @Column(name = "DURATION")
    private Double duration;

    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<MovieType> movieTypes = new HashSet<>();



    public Movie() {
    }

    public Movie(String movieId, String actor, String director, Double duration, Date fromDate, Date toDate, Set<MovieType> movieTypes) {
        this.movieId = movieId;
        this.actor = actor;
        this.director = director;
        this.duration = duration;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.movieTypes = movieTypes;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Set<MovieType> getMovieTypes() {
        return movieTypes;
    }

    public void setMovieTypes(Set<MovieType> movieTypes) {
        this.movieTypes = movieTypes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", movieTypes=" + movieTypes +
                '}';
    }
}
