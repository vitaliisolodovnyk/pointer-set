import java.util.Objects;

public class SteeringWheel {

    private int amountButtons;
    private int radius;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteeringWheel that = (SteeringWheel) o;
        return amountButtons == that.amountButtons &&
                radius == that.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountButtons, radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getButtons() {
        return amountButtons;
    }

    public SteeringWheel(int amountButtons, int radius) {
        this.amountButtons = amountButtons;
        this.radius = radius;
    }
}
