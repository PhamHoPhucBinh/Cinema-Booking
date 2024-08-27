package service;

import DAO.CrudDao;

import entity.CinemaRoomDetail;

import java.util.List;

public class CinemaRoomDetailService {
    private CrudDao<CinemaRoomDetail, Integer> cinemaRoomDetailDao;

    public CinemaRoomDetailService() {
        this.cinemaRoomDetailDao = new CrudDao<>(CinemaRoomDetail.class);
    }

    public void addCinemaRoomDetail(CinemaRoomDetail cinemaRoomDetail) {
        cinemaRoomDetailDao.save(cinemaRoomDetail);
    }

    public CinemaRoomDetail getCinemaRoomDetailById(Integer cinemaRoomDetailId) {
        return cinemaRoomDetailDao.findById(cinemaRoomDetailId);
    }

    public List<CinemaRoomDetail> cinemaRoomDetails() {
        return cinemaRoomDetailDao.findAll();
    }

    public void updateCinemaRoomDetail(CinemaRoomDetail cinemaRoomDetail) {
        cinemaRoomDetailDao.update(cinemaRoomDetail);
    }

    public void delete(CinemaRoomDetail cinemaRoomDetail) {
        cinemaRoomDetailDao.delete(cinemaRoomDetail);
    }
}
