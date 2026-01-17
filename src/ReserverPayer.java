public class ReserverPayer {

    private String creditCardDetails;
    private String id;

    private ReserverPayer(String creditCardDetails, String id) {
        if (creditCardDetails == null || id == null) {
            throw new IllegalArgumentException("Invalid reserver payer data");
        }
        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }

    public static ReserverPayer create(String creditCardDetails, String id) {
        return new ReserverPayer(creditCardDetails, id);
    }
}
