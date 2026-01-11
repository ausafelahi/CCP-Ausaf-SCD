import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        HotelChain hotelChain = new HotelChain();

        Hotel hotel = new Hotel("Blue Moon Hotel");

        Room room101 = new Room(101);

        Guest guest = Guest.create(
                "Ali Raza",
                "Lahore, Pakistan");

        ReserverPayer reserverPayer = hotelChain.createReserverPayer(
                "1234-5678-9012-3456",
                "RP-1001");

        Reservation reservation = hotelChain.makeReservation(
                hotel,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                2);

        System.out.println("Reservation created.");

        hotelChain.checkInGuest(room101, guest);
        System.out.println("Guest checked in.");

        System.out.println("Room available: " + hotel.available(room101));

        hotelChain.checkOutGuest(room101);
        System.out.println("Guest checked out.");

        hotelChain.cancelReservation();
        System.out.println("Reservation cancelled.");

        System.out.println("Room available: " + hotel.available(room101));
    }
}
