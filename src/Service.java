public class Service {

    public Car changeCarColor(Car car, String newColor) {
        if(car.getColor() == null || String.valueOf(car.getColor()) == newColor) {
            return null;
        } else {
            car.changeColor(newColor);
            return car;
        }
    }
    public Car changeWheels(Car car, int newSize) {
        if(car.getWheelSize() == null || Integer.valueOf(car.getWheelSize().ordinal()) == newSize) {
            return null;
        } else {
            car.changeWheelSize(String.valueOf(newSize));
            return car;
        }
    }
    public Car changeCarOptions(Car car, String[] newOption) {
        if(car.getOptions() == null || String.valueOf(car.getOptions()) == String.valueOf(newOption)) {
            return null;
        } else {
            car.changeOption(newOption);
            return car;
        }
    }
}
