import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReserverPayerTest {

    @Test
    void validReserverPayerCreated() {
        ReserverPayer rp = ReserverPayer.create("1234567890123456", "RP01");
        assertNotNull(rp);
    }

    @Test
    void nullDataThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> ReserverPayer.create(null, "RP01"));
    }
}
