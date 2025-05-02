import java.util.*;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieBooking {
    static Set<Integer> bookedSeats = new HashSet<>();

    public static void bookSeat(int seatNo) throws SeatAlreadyBookedException {
        if (bookedSeats.contains(seatNo)) {
            throw new SeatAlreadyBookedException("Seat " + seatNo + " is already booked!");
        }
        bookedSeats.add(seatNo);
        System.out.println("Seat " + seatNo + " booked successfully.");
    }
}

public class BookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter seat number to book: ");
            int seat1 = sc.nextInt();
            MovieBooking.bookSeat(seat1);

            System.out.print("Try booking another seat (or same one): ");
            int seat2 = sc.nextInt();
            MovieBooking.bookSeat(seat2);
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Error: " + e.getMessage());
        }
        sc.close();
    }
}
