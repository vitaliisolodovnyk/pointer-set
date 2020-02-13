import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Car> cars = new LinkedHashSet<>();
        CarManager carManager = new CarManager(cars);

        Car volvo = new Car("Volvo","Hatchback", 18, TypeTires.SUMMER, 20, 15,"Green");
        Car landRover = new Car("LandRover", "Sedan", 19, TypeTires.SUMMER, 30,16,"White");
        Car ford = new Car("Ford", "Coupe", 17, TypeTires.SUMMER, 25, 17,"Black");
        Car tesla = new Car("Tesla", "Sedan", 15, TypeTires.WINTER, 40, 18,"Grey");
        Car mazda = new Car("Mazda", "SUV", 16, TypeTires.WINTER, 30, 19,"Purple");

        cars.add(volvo);
        cars.add(landRover);
        cars.add(ford);
        cars.add(tesla);
        cars.add(mazda);

        carManager.changeWheelType();
        carManager.removeCarsInRange();
        carManager.findCars();
    }
}
