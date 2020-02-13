import java.util.Objects;

public class Car {

    private String model;
    Wheels wheels;
    SteeringWheel steeringWheel;
    Body body;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(wheels, car.wheels) &&
                Objects.equals(steeringWheel, car.steeringWheel) &&
                Objects.equals(body, car.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, wheels, steeringWheel, body);
    }

    public Car(String model, String bodyType, int diameter, TypeTires typeTires, int amountButtons, int radius, String color) {
        this.model = model;
        this.wheels = new Wheels(diameter, typeTires);
        this.steeringWheel = new SteeringWheel(amountButtons, radius);
        this.body = new Body(color, bodyType);

    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Body getBody() {
        return body;
    }
}
