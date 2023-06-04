import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(Color.BLACK, "BMW", 2007, 25, 7000, Options.GO),
                new Car(Color.ORANGE, "Lexus", 2022, 19, 5000, Options.STOP),
                new Car(Color.WHITE, "Honda", 2015, 28, 4500, Options.LOCK)
        };
        for(var car: cars) {
            System.out.println(car.toString());
        }
        AutoFactory factory = new AutoFactory();
        AutoSalon salon = new AutoSalon(factory);

        System.out.println(Arrays.toString(factory.getModels()));
        System.out.println(Arrays.toString(factory.getEngineCapasities()));
        System.out.println(Arrays.toString(factory.getColors()));
        System.out.println(Arrays.toString(factory.getWheelSizes()));
        cars[0].changeColor("RED");
        cars[0].changeWheelSize(13);
        System.out.println(cars[0].toString());
        //Car audi = AutoSalon.sellCar(Color.BLACK, String.valueOf(Model.AUDI), 2015, 15, 4000, Options.LOCK);
        //System.out.println(audi);  Закомментировала потому что не знаю как исправить, мне выводит ошибку!!!!
    }
}