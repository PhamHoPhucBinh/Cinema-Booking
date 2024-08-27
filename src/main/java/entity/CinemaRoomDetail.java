package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CINEMA_ROOM_DETAIL")
public class CinemaRoomDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CINEMA_ROOM_DETAIL_ID")
    private int cinemaRoomDetailId;

    @ManyToOne
    @JoinColumn(name = "CINEMA_ROOM_ID", nullable = false, referencedColumnName = "cinema_room_id")
    private CinemaRoom cinemaRoom;

    @Column(name = "ROOM_RATE")
    private double roomRate;

    @Column(name = "ACTIVE_DATE")
    private Date activeDate;

    @Column(name = "ROOM_DESCRIPTION")
    private String roomDescription;

    public CinemaRoomDetail() {
    }

    public CinemaRoomDetail(int cinemaRoomDetailId, CinemaRoom cinemaRoom, double roomRate, Date activeDate, String roomDescription) {
        this.cinemaRoomDetailId = cinemaRoomDetailId;
        this.cinemaRoom = cinemaRoom;
        this.roomRate = roomRate;
        this.activeDate = activeDate;
        this.roomDescription = roomDescription;
    }

    @Override
    public String toString() {
        return "CinemaRoomDetail{" +
                "cinemaRoomDetailId=" + cinemaRoomDetailId +
                ", cinemaRoom=" + cinemaRoom +
                ", roomRate=" + roomRate +
                ", activeDate=" + activeDate +
                ", roomDescription='" + roomDescription + '\'' +
                '}';
    }

    public int getCinemaRoomDetailId() {
        return cinemaRoomDetailId;
    }

    public void setCinemaRoomDetailId(int cinemaRoomDetailId) {
        this.cinemaRoomDetailId = cinemaRoomDetailId;
    }

    public CinemaRoom getCinemaRoom() {
        return cinemaRoom;
    }

    public void setCinemaRoom(CinemaRoom cinemaRoom) {
        this.cinemaRoom = cinemaRoom;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
}
