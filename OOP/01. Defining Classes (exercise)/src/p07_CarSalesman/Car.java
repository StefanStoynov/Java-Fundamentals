package p07_CarSalesman;

public class Car {


    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder car = new StringBuilder();
        car.append(this.model).append(":").append(System.lineSeparator());
        car.append(this.engine).append(System.lineSeparator());
        if (this.weight == 0) {
            car.append("Weight: n/a").append(System.lineSeparator());
        } else {
            car.append("Weight: ").append(this.weight).append(System.lineSeparator());
        }
        if (this.color == null) {
            car.append("Color: n/a").append(System.lineSeparator());
        } else {
            car.append("Color: ").append(this.color).append(System.lineSeparator());
        }
        return car.toString();
    }
}
