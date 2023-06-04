public class Service {

    public Car changeCarColor(Car car, String newColor) {
        car.changeColor(newColor);
        return car;
    }
    public Car changeWheels(Car car, int newSize) {
        car.changeWheelSize(newSize);
        return car;
    }
    public Car changeCarOptions(Car car, String newOption) {
        car.changeOptions(newOption);
        return car;
    }
}
