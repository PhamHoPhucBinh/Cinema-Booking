import service.MovieService;
import service.SeatService;

public class Main {
    public static void main(String[] args) {
        // Get a session from Hibernate
//        Session session = null;
//        Transaction transaction = null;
//
//        try {
//            // Open session
//            session = HibernateUtil.getSessionFactory().openSession();
//
//            // Begin transaction
//            transaction = session.beginTransaction();
//
//            // Create CinemaRoom
//            CinemaRoom cinemaRoom = new CinemaRoom();
//            cinemaRoom.setCinemaRoomName("IMAX");
//            cinemaRoom.setSeatQuantity(20);
//
//            // Save CinemaRoom to get the generated ID
//            session.save(cinemaRoom);
//
//            // Create CinemaRoomDetail
//            CinemaRoomDetail cinemaRoomDetail = new CinemaRoomDetail();
//            cinemaRoomDetail.setCinemaRoom(cinemaRoom);
//            cinemaRoomDetail.setRoomRate(250.00);
//            cinemaRoomDetail.setActiveDate(new Date());
//            cinemaRoomDetail.setRoomDescription("Large IMAX screen with 4K resolution and 3D capability.");
//
//            // Save CinemaRoomDetail
//            session.save(cinemaRoomDetail);
//
//            // Create and save multiple Seat objects
//            for (int row = 1; row <= 10; row++) {
//                for (char col = 'A'; col <= 'O'; col++) {
//                    Seat seat = new Seat();
//                    seat.setCinemaRoom(cinemaRoom);
//                    seat.setSeatColumn(String.valueOf(col));
//                    seat.setSeatRow(row);
//                    seat.setSeatStatus("Available");
//                    seat.setSeatType(row <= 2 ? "VIP" : "Standard");
//
//                    // Save each Seat
//                    session.save(seat);
//                }
//            }
//
//            // Commit the transaction
//            transaction.commit();
//
//            System.out.println("Cinema Room, Cinema Room Details, and Seats have been saved to the database.");
//
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            // Ensure session is closed properly
//            if (session != null) {
//                session.close();
//            }
//        }
//
//        // Close the SessionFactory when done
//        HibernateUtil.getSessionFactory().close();
//        SeatDAO seatDAO = new SeatDAO();
//        CinemaRoomDAO cinemaRoomDAO = new CinemaRoomDAO();
//        cinemaRoomDAO.getRoomById(1);
////        seatDAO.getAllSeats();
//        seatDAO.getSeatById(301);
        MovieService movieService = new MovieService();
        SeatService seatService = new SeatService();
//        Movie movie = new Movie();
//        movie.setMovieId("M001");
//        movie.setActor("Actor Name");
//        movie.setDirector("Director Name");
//        movie.setDuration(120.0);
//        movie.setFromDate(new Date());
//        movie.setToDate(new Date());
//
//        // Save the movie
//        movieService.addMovie(movie);

        // Retrieve the movie
//        Movie retrievedMovie = movieService.getMovieById("M001");
//        System.out.println("Retrieved Movie: " + retrievedMovie.getActor());
        // Update and Delete operations can be similarly done.
        seatService.seats();
        System.out.println(seatService.seats());
//        seatService.delete(seatService.getSeatById(301));
    }
}
