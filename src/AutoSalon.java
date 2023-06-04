public class AutoSalon {
    private final AutoFactory factory;

    public AutoSalon(AutoFactory factory) {
        this.factory = factory;
    }


    public Car sellCar(Color color, String model, int yearOfIssue, int wheelSize, int engineCapasity, Options options) {
        color = factory.createColors(color);
        model = String.valueOf(factory.createModels(Model.valueOf(model)));
        wheelSize = factory.createWheelSize(wheelSize);
        engineCapasity = factory.createEngineCapasity(engineCapasity);
        return new Car(color, model, yearOfIssue, wheelSize, engineCapasity, options);
    }

}
