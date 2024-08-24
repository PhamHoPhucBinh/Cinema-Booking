package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CINEMA_ROOM")
public class CinemaRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CINEMA_ROOM_ID")
    private int cinemaRoomId;

    @Column(name = "CINEMA_ROOM_NAME")
    private String cinemaRoomName;

    @Column(name = "SEAT_QUANTITY")
    private int seatQuantity;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Seat> seats;

    public CinemaRoom(int cinemaRoomId, String cinemaRoomName, int seatQuantity, Set<Seat> seats) {
        this.cinemaRoomId = cinemaRoomId;
        this.cinemaRoomName = cinemaRoomName;
        this.seatQuantity = seatQuantity;
        this.seats = seats;
    }

    public CinemaRoom() {
    }

    public int getCinemaRoomId() {
        return cinemaRoomId;
    }

    public void setCinemaRoomId(int cinemaRoomId) {
        this.cinemaRoomId = cinemaRoomId;
    }

    public String getCinemaRoomName() {
        return cinemaRoomName;
    }

    public void setCinemaRoomName(String cinemaRoomName) {
        this.cinemaRoomName = cinemaRoomName;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "CinemaRoom{" +
                "cinemaRoomId=" + cinemaRoomId +
                ", cinemaRoomName='" + cinemaRoomName + '\'' +
                ", seatQuantity=" + seatQuantity +
                ", seats=" + seats +
                '}';
    }
}
