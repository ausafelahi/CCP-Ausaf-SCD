import java.time.LocalDate;

public class HotelChain {

    public Reservation makeReservation(Hotel hotel,
            LocalDate startDate,
            LocalDate endDate,
            int number) {
        if (!canMakeReservation(hotel)) {
            throw new IllegalStateException("Cannot make reservation");
        }
        return hotel.createReservation(startDate, endDate, number);
    }

    public void cancelReservation() {
        if (!canCancelReservation()) {
            throw new IllegalStateException("Cannot cancel reservation");
        }
    }

    public void checkInGuest(Room room, Guest guest) {
        if (!canCheckInGuest(room)) {
            throw new IllegalStateException("Cannot check in guest");
        }
        room.createGuest(guest);
    }

    public void checkOutGuest(Room room) {
        if (!canCheckOutGuest(room)) {
            throw new IllegalStateException("Cannot check out guest");
        }
        room.removeGuest();
    }

    public ReserverPayer createReserverPayer(String creditCard, String id) {
        return ReserverPayer.create(creditCard, id);
    }

    private boolean canMakeReservation(Hotel hotel) {
        return hotel != null;
    }

    private boolean canCancelReservation() {
        return true;
    }

    private boolean canCheckInGuest(Room room) {
        return room != null && !room.isOccupied();
    }

    private boolean canCheckOutGuest(Room room) {
        return room != null && room.isOccupied();
    }
}
