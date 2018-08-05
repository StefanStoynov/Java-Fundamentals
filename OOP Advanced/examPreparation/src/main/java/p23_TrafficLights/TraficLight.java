package p23_TrafficLights;

public class TraficLight {
    private Light light;

    public TraficLight(String light) {
        this.light = Light.valueOf(light);
    }

    public void changeLight() {
        this.light = Light.values()[(this.light.ordinal() + 2) % 3];
    }

    @Override
    public String toString() {
        return this.light.name();
    }
}
