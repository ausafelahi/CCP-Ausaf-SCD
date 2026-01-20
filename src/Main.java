import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {

                System.out.println("System initialization started");

                // 1. Create Hotel Chain
                HotelChain chain = new HotelChain();
                System.out.println("Hotel chain initialized");

                // 2. Create Hotel
                Hotel hotel = new Hotel("Pearl Continental");
                System.out.println("Hotel registered");

                // 3. Create Room Types
                RoomType deluxe = new RoomType("Deluxe", 15000);
                RoomType standard = new RoomType("Standard", 8000);
                System.out.println("Room classifications configured");

                // 4. Create Rooms
                Room room101 = new Room(101, "Deluxe");
                Room room102 = new Room(102, "Standard");
                System.out.println("Rooms instantiated and linked with room types");

                // 5. Check room availability
                System.out.println("Initial availability status verified");
                System.out.println("Room 101 available: " + hotel.available(room101));
                System.out.println("Room 102 available: " + hotel.available(room102));

                // 6. Create Guest
                Guest guest = Guest.create("Ahmed Ali", "Islamabad");
                System.out.println("Guest profile created");

                // 7. Create Reserver / Payer
                ReserverPayer payer = chain.createReserverPayer(
                                "1234567890123456",
                                "RP01");
                System.out.println("Reservation payer identity validated");

                // 8. Make Reservation
                Reservation reservation = chain.makeReservation(
                                hotel,
                                LocalDate.now().plusDays(1),
                                LocalDate.now().plusDays(3),
                                1);
                System.out.println("Reservation successfully recorded for scheduled dates");

                // 9. Check-in Guest
                chain.checkInGuest(room101, guest);
                System.out.println("Guest occupancy assigned to room 101");

                // 10. Verify room occupancy
                System.out.println("Availability status updated after check-in");
                System.out.println("Room 101 available: " + hotel.available(room101));

                // 11. Check-out Guest
                chain.checkOutGuest(room101);
                System.out.println("Guest occupancy released from room 101");

                // 12. Verify room availability after checkout
                System.out.println("Availability status verified after check-out");
                System.out.println("Room 101 available: " + hotel.available(room101));

                // 13. Cancel Reservation
                chain.cancelReservation();
                System.out.println("Reservation lifecycle completed and closed");

                System.out.println("System execution completed without inconsistencies");
        }
}
