public class Car {
    private Color color;
    private final Model model;
    private final int yearOfIssue;
    private WheelSize wheelSize;
    private final Capasity engineCapasity;
    private String[] options = new String[]{"Go", "Stop", "Lock" };
    public Car(Color color, Model model, int yearOfIssue, WheelSize wheelSize, Capasity engineCapasity, String[] options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineCapasity = engineCapasity;
        this.options = options;
    }
    @Override
    public String toString() {
        return "Car {" +
                "color = " + color +
                ", model = '" + model + '\'' +
                ", yearOfIssue = " + yearOfIssue +
                ", wheelSize = " + wheelSize +
                ", engineCapasity = " + engineCapasity +
                ", options = " + options +
                '}';
    }
    Color changeColor(String newColor){
        this.color = Color.valueOf(newColor);
        return this.color;
    }
    WheelSize changeWheelSize(String newSize){
        this.wheelSize = WheelSize.valueOf(newSize);
        return this.wheelSize;
    }
    String[] changeOption(String[] newOption){
        this.options = newOption;
        return this.options;
    }

    public Color getColor() {
        return color;
    }


    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public Model getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Capasity getEngineCapasity() {
        return engineCapasity;
    }

    public String[] getOptions() {
        return options;

    }
}


}

