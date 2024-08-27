package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.io.Serializable;

@Embeddable
public class MovieTypeId implements Serializable {
    private int typeId;
    private String movieId;

    public MovieTypeId(int typeId, String movieId) {
        this.typeId = typeId;
        this.movieId = movieId;
    }

    public MovieTypeId() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "MovieTypeId{" +
                "typeId=" + typeId +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}
