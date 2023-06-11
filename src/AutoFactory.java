import java.util.Arrays;

public class AutoFactory implements Create{
    private final Model[] models = Model.values();
    private final Capasity[] engineCapasities = Capasity.values();
    private final Color[] colors = Color.values();
    private final WheelSize[] wheelSizes = WheelSize.values();
    public Model createModels( Model model) {
        Model result = null;
        switch (model) {
            case BMW: {
                result = Model.BMW;
                break;
            }
            case AUDI: {
                result = Model.AUDI;
                break;
            }
            case HONDA: {
                result = Model.HONDA;
                break;
            }case MAZDA: {
                result = Model.MAZDA;
                break;
            }case MERCEDES: {
                result = Model.MERCEDES;
                break;
            }case SUZUKI: {
                result = Model.SUZUKI;
                break;
            }case KIA: {
                result = Model.KIA;
                break;
            }
        }
        return result;
    }

    @Override
    public int createEngineCapasity(int engineCapasity) {
        return 0;
    }

    public Capasity createEngineCapasity(Capasity engineCapasity) {
        Capasity result = null;
        switch (engineCapasity) {
            case LOW: {
                result = Capasity.LOW;
                break;
            }
            case MEDIUM: {
                result = Capasity.MEDIUM;
                break;
            }
            case HIGH: {
                result = Capasity.HIGH;
                break;
            }
        }
        return result;
    }
    public Color createColors(Color color) {
        Color result = null;
        switch (color) {
            case RED: {
                result = Color.RED;
                break;
            }
            case ORANGE: {
                result = Color.ORANGE;
                break;
            }
            case YELLOW: {
                result = Color.YELLOW;
                break;
            }
            case BLUE: {
                result = Color.BLUE;
                break;
            }
            case BLACK: {
                result = Color.BLACK;
                break;
            }
            case GREY: {
                result = Color.GREY;
                break;
            }
            case WHITE: {
                result = Color.WHITE;
                break;
            }
        }
        return result;
    }


    public WheelSize createWheelSize(WheelSize wheelSize) {
        WheelSize result = null;
        switch (wheelSize) {
            case SMALL: {
                result = WheelSize.SMALL;
                break;
            }
            case AVERAGE: {
                result = WheelSize.HUGE;
                break;
            }
            case HUGE: {
                result = WheelSize.AVERAGE;
                break;
            }
        }
        return result;
    }
    @Override
    public int createWheelSize(int wheelSize) {
        return 0;
    }
    @Override
    public String toString() {
        return "AutoFactory {" +
                "models = " + Arrays.toString(models) +
                ", engineCapasities = " + Arrays.toString(engineCapasities) +
                ", colors = " + Arrays.toString(colors) +
                ", wheelSizes = " + Arrays.toString(wheelSizes) +
                '}';
    }

    public Car createCar(Color color, Model model, int yearOfIssue, WheelSize wheelSize, Capasity engineCapasity, String[] option) {
        color = createColors(color);
        model = createModels(model);
        wheelSize = createWheelSize(wheelSize);
        engineCapasity = createEngineCapasity(engineCapasity);
        return new Car(color, model, yearOfIssue, wheelSize, engineCapasity, option);
    }

    public Model[] getModels() { return models; }
    public Capasity[] getEngineCapasities() { return engineCapasities; }
    public Color[] getColors() { return colors; }
    public WheelSize[] getWheelSizes() { return wheelSizes; }

}
