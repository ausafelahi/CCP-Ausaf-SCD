
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ReservationTest {

    @Test
    void validReservationCreated() {
        Reservation r = Reservation.create(
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1);
        assertNotNull(r);
    }

    @Test
    void invalidDatesThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> Reservation.create(
                        LocalDate.now(),
                        LocalDate.now(),
                        1));
    }
}
