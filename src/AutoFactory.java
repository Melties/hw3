import java.util.Arrays;

public class AutoFactory implements Create{
    private final Model[] models = Model.values();
    private final int[] engineCapasities = {3000, 4000, 5000};
    private final Color[] colors = Color.values();
    private final int[] wheelSizes = {15, 20, 25};
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
    public int createEngineCapasity(int engineCapasity) {
        int result = 0;
        switch (engineCapasity) {
            case 3000: {
                result = 3000;
                break;
            }
            case 4000: {
                result = 4000;
                break;
            }
            case 5000: {
                result = 5000;
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
    public int createWheelSize(int wheelSize) {
        int result = 0;
        switch (wheelSize) {
            case 15: {
                result = 15;
                break;
            }
            case 20: {
                result = 20;
                break;
            }
            case 25: {
                result = 25;
                break;
            }
        }
        return result;
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

    public Model[] getModels() { return models; }
    public int[] getEngineCapasities() { return engineCapasities; }
    public Color[] getColors() { return colors; }
    public int[] getWheelSizes() { return wheelSizes; }

}
