import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTypeTest {

    @Test
    void validRoomTypeCreated() {
        RoomType rt = new RoomType("Deluxe", 5000);
        assertNotNull(rt);
    }

    @Test
    void negativeCostThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType("Deluxe", -1));
    }
}
