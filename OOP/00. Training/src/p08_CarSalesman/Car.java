package p08_CarSalesman;

import java.sql.SQLSyntaxErrorException;

public class Car {
    //model, engine, weight and color
    private String model;
    private Engine engine;
    private int weight;
    private String color;

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
        StringBuilder sb = new StringBuilder();
        sb.append(this.model).append(":").append(System.lineSeparator())
                .append(this.engine.getEngineModel()).append(":").append(System.lineSeparator())
                .append("Power: ").append(engine.getPower()).append(System.lineSeparator())
                .append("Displacement: ");
        if (engine.getDisplacement()!=0){
            sb.append(engine.getDisplacement()).append(System.lineSeparator());
        }else{
            sb.append("n/a").append(System.lineSeparator());
        }
        sb.append("Efficiency: ");
        if (engine.getEfficiency()!=null){
            sb.append(engine.getEfficiency()).append(System.lineSeparator());
        }else{
            sb.append("n/a").append(System.lineSeparator());
        }
        sb.append("Weight: ");
        if (this.weight!=0){
            sb.append(this.weight).append(System.lineSeparator());
        }else{
            sb.append("n/a").append(System.lineSeparator());
        }
        sb.append("Color: ");
        if (this.color!=null){
            sb.append(this.color);
        }else{
            sb.append("n/a");
        }
        return sb.toString();
    }
}
