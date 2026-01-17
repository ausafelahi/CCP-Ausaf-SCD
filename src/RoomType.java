public class RoomType {

    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        if (kind == null || cost <= 0) {
            throw new IllegalArgumentException("Invalid room type");
        }
        this.kind = kind;
        this.cost = cost;
    }
}
