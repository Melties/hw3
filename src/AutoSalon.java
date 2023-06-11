public class AutoSalon {
    private final AutoFactory factory;

    public AutoSalon(AutoFactory factory) {
        this.factory = factory;
    }

    public Car sellCar(Car car){
        car = factory.createCar(car.getColor(), car.getModel(), car.getYearOfIssue(),
                car.getWheelSize(), car.getEngineCapasity(), car.getOptions());
        return car;
    }

}
