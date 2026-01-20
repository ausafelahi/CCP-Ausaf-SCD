import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    void roomInitiallyNotOccupied() {
        Room room = new Room(101, "Deluxe");
        assertFalse(room.isOccupied());
    }

    @Test
    void guestOccupiesRoom() {
        Room room = new Room(101, "Deluxe");
        room.createGuest(Guest.create("Ali", "Lahore"));
        assertTrue(room.isOccupied());
    }

    @Test
    void secondGuestNotAllowed() {
        Room room = new Room(101, "Deluxe");
        room.createGuest(Guest.create("Ali", "Lahore"));

        assertThrows(IllegalStateException.class,
                () -> room.createGuest(Guest.create("Ahmed", "Karachi")));
    }
}
