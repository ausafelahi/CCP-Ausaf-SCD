
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void roomAvailabilityCheckedCorrectly() {
        Hotel hotel = new Hotel("PC");
        Room room = new Room(101, "Deluxe");

        assertTrue(hotel.available(room));

        room.createGuest(Guest.create("Ali", "Lahore"));
        assertFalse(hotel.available(room));
    }
}
