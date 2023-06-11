
import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(Color.BLACK, Model.BMW, 2007, WheelSize.AVERAGE, Capasity.HIGH, new String[]{"Lock", "Go"}),
                new Car(Color.ORANGE, Model.MERCEDES, 2022, WheelSize.SMALL, Capasity.HIGH, new String[]{ "Stop"}),
                new Car(Color.WHITE, Model.HONDA, 2015, WheelSize.HUGE, Capasity.MEDIUM, new String[]{"Stop", "Go"})
        };
        for(var car: cars) {
            System.out.println(car.toString());
        }
        AutoFactory factory = new AutoFactory();
        AutoSalon salon = new AutoSalon(factory);

        Car kia = new Car(Color.RED, Model.KIA, 2019, WheelSize.HUGE, Capasity.HIGH, new String[]{"Stop", "Lock", "Go"});
        System.out.println(Arrays.toString(factory.getModels()));
        System.out.println(Arrays.toString(factory.getEngineCapasities()));
        System.out.println(Arrays.toString(factory.getColors()));
        System.out.println(Arrays.toString(factory.getWheelSizes()));
        cars[0].changeColor("RED");
        cars[0].changeWheelSize(String.valueOf(13));
        System.out.println(kia.toString());
    }
}
