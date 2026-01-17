import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {

                HotelChain chain = new HotelChain();
                Hotel hotel = new Hotel("Pearl Continental");

                Room room101 = new Room(101);

                Guest guest = Guest.create("Ahmed Ali", "Islamabad");
                ReserverPayer payer = chain.createReserverPayer("1234567890123456", "RP01");

                Reservation reservation = chain.makeReservation(
                                hotel,
                                LocalDate.now().plusDays(1),
                                LocalDate.now().plusDays(3),
                                1);

                System.out.println("Reservation created");

                chain.checkInGuest(room101, guest);
                System.out.println("Guest checked in");

                System.out.println("Room available: " + hotel.available(room101));

                chain.checkOutGuest(room101);
                System.out.println("Guest checked out");

                chain.cancelReservation();
                System.out.println("Reservation cancelled");

                System.out.println("Room available: " + hotel.available(room101));
        }
}
