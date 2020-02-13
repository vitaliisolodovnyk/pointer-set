import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CarManager {

    Set<Car> cars;

    public CarManager(Set<Car> cars) {
        this.cars = cars;
    }

    Scanner scanner = new Scanner(System.in);

    void  changeWheelType(){
        System.out.println("Введіть тип кузову: ");
        String b = scanner.next();
        System.out.println("Введіть даметр колеса: ");
        int d = scanner.nextInt();
        for (Car car : cars) {
            if (car.body.getBodyType().equals(b) && car.wheels.getDiameter() == d){
                String winter = "зимова";
                String summer = "літня";
                System.out.println("Введіть бажаний тип гуми (зимова/літня): ");
                String s = scanner.next();
                if (winter.equals(s)){
                    System.out.println("Ваша гума: "+ s);
                }
                else if (summer.equals(s)){
                    System.out.println("Ваша гума: "+ s);
                }
            }
        }
    }

    void removeCarsInRange(){
        System.out.println("Введіть нижнє значення діаметру коліс: ");
        int d = scanner.nextInt();
        System.out.println("Введіть верхнє значення діаметру коліс: ");
        int u = scanner.nextInt();
        Iterator<Car> list = cars.iterator();
        while (list.hasNext()){
            Car car = list.next();
            if (car.wheels.getDiameter() >= d && car.wheels.getDiameter() <= u){
                list.remove();
                System.out.println("Ви видалили: " + car.getModel());
            }
        }
    }

    void findCars(){
        System.out.println("Введіть тип шин: ");
        TypeTires typeTires = TypeTires.toEnum(scanner.next());
        System.out.println("Введіть нижнє значення діаметру коліс: ");
        int d = scanner.nextInt();
        System.out.println("Введіть верхнє значення діаметру коліс: ");
        int u = scanner.nextInt();
        for (Car car : cars){
            if (car.wheels.typeTires.equals(typeTires)){
                if (car.wheels.getDiameter() >= d && car.wheels.getDiameter() <= u){
                    System.out.println("Авто: " + car.getModel());
                }
            }
        }

    }
}
