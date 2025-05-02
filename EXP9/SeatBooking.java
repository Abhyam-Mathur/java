// File: SeatBooking.java
import java.util.HashSet;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

public class SeatBooking {
    static HashSet<Integer> bookedSeats = new HashSet<>();

    public static void bookSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (bookedSeats.contains(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat number " + seatNumber + " is already booked.");
        }
        bookedSeats.add(seatNumber);
        System.out.println("Seat " + seatNumber + " booked successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter seat number to book: ");
            int seat1 = sc.nextInt();
            bookSeat(seat1);

            System.out.print("Try booking the same seat again (seat number): ");
            int seat2 = sc.nextInt();
            bookSeat(seat2);
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Error: " + e.getMessage());
        }

        sc.close();
    }
}
