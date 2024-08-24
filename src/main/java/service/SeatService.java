package service;

import DAO.CrudDao;
import entity.Seat;

import java.util.List;

public class SeatService {
    private CrudDao<Seat, Integer> seatDao;

    public SeatService() {
        this.seatDao = new CrudDao<>(Seat.class);
    }

    public void addSeat(Seat seat) {
        seatDao.save(seat);
    }

    public Seat getSeatById(Integer seatId) {
        return seatDao.findById(seatId);
    }

    public List<Seat> seats() {
        return seatDao.findAll();
    }

    public void updateSeat(Seat seat) {
        seatDao.update(seat);
    }

    public void delete(Seat seat) {
        seatDao.delete(seat);
    }
}
