package p07_CarSalesman;

public class Engine {


    private String model;
    private int power;
    private int displacement;
    private String efficiency;


    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }



    @Override
    public String toString() {
        StringBuilder engine = new StringBuilder();

        engine.append(this.model).append(":").append(System.lineSeparator());
        engine.append("Power: ").append(this.power).append(System.lineSeparator());
        if (this.displacement == 0) {
            engine.append("Displacement: n/a").append(System.lineSeparator());
        } else {
            engine.append("Displacement: ").append(this.displacement).append(System.lineSeparator());
        }
        if (this.efficiency == null) {
            engine.append("Efficiency: n/a");
        } else {
            engine.append("Efficiency: ").append(this.efficiency);
        }
        return engine.toString();
    }
}
