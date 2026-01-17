public class Guest {

    private String name;
    private String addressDetails;

    private Guest(String name, String addressDetails) {
        if (name == null || addressDetails == null) {
            throw new IllegalArgumentException("Invalid guest data");
        }
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public static Guest create(String name, String addressDetails) {
        return new Guest(name, addressDetails);
    }
}
