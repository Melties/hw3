public class Car {
    private Color color;
    private final String model;
    private final int yearOfIssue;
    private int wheelSize;
    private final int engineCapasity;
    private Options options;

    public Car(Color color, String model, int yearOfIssue, int wheelSize, int engineCapasity, Options options) {
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
    int changeWheelSize(int newSize){
        this.wheelSize = newSize;
        return this.wheelSize;
    }
    Options changeOptions(String newOption){
        this.options = Options.valueOf(newOption);
        return this.options;
    }

}

