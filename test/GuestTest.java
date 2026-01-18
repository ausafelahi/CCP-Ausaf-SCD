import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GuestTest {

    @Test
    void validGuestCreated() {
        Guest guest = Guest.create("Ali", "Lahore");
        assertNotNull(guest);
    }

    @Test
    void nullNameThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> Guest.create(null, "Lahore"));
    }
}
