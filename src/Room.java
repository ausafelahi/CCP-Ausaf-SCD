public class Room {

    private int number;
    private String type; // Room type as a string
    private Guest occupant;

    // Constructor with room number and type
    public Room(int number, String type) {
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid room number");
        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Room type required");
        }
        this.number = number;
        this.type = type;
    }

    public void createGuest(Guest guest) {
        if (guest == null) {
            throw new IllegalArgumentException("Guest required");
        }
        if (occupant != null) {
            throw new IllegalStateException("Room already occupied");
        }
        this.occupant = guest;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public void removeGuest() {
        this.occupant = null;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }
}
