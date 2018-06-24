package p08_CarSalesman;

public class Engine {
    // model, power, displacement and efficiency
    private String engineModel;
    private String power;
    private int displacement;
    private String efficiency;

    public Engine(String engineModel, String power) {
        this.engineModel = engineModel;
        this.power = power;
    }

    public Engine(String engineModel, String power, int displacement) {
        this(engineModel,power);
        this.displacement = displacement;
    }

    public Engine(String engineModel, String power, String efficiency) {
        this(engineModel,power);
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, String power, int displacement, String efficiency) {
        this(engineModel,power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return this.engineModel;
    }

    public String getPower() {
        return this.power;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
