package service;

import DAO.CrudDao;
import entity.CinemaRoom;

import java.util.List;

public class CinemaRoomService {
    private CrudDao<CinemaRoom, Integer> cinemaRoomDao;

    public CinemaRoomService() {
        this.cinemaRoomDao = new CrudDao<>(CinemaRoom.class);
    }

    public void addCinemaRoom(CinemaRoom cinemaRoom) {
        cinemaRoomDao.save(cinemaRoom);
    }

    public CinemaRoom getCinemaRoomById(Integer cinemaRoomId) {
        return cinemaRoomDao.findById(cinemaRoomId);
    }

    public List<CinemaRoom> cinemaRooms() {
        return cinemaRoomDao.findAll();
    }

    public void updateCinemaRoom(CinemaRoom cinemaRoom) {
        cinemaRoomDao.update(cinemaRoom);
    }

    public void delete(CinemaRoom cinemaRoom) {
        cinemaRoomDao.delete(cinemaRoom);
    }
}
