package Exam3;



public class WaterMonument extends Monuments {
    private int waterAffinity;
    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    public int getWaterAffinity() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("Water Monument: %s, Water Affinity: %d",super.getName(),this.waterAffinity);
    }
}
