package BT2;

public class Shirt {
    private final Color color;
    private final Size size;

    public Shirt(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return STR."\{color}-Color & \{size}-Size";
    }
}