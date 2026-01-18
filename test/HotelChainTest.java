import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class HotelChainTest {

    @Test
    void reservationCreatedThroughChain() {
        HotelChain chain = new HotelChain();
        Hotel hotel = new Hotel("PC");

        Reservation r = chain.makeReservation(
                hotel,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(2),
                1);

        assertNotNull(r);
    }

    @Test
    void checkInAndCheckOutGuest() {
        HotelChain chain = new HotelChain();
        Room room = new Room(101);
        Guest guest = Guest.create("Ali", "Lahore");

        chain.checkInGuest(room, guest);
        assertTrue(room.isOccupied());

        chain.checkOutGuest(room);
        assertFalse(room.isOccupied());
    }
}
