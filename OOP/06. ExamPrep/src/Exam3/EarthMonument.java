package Exam3;



public class EarthMonument extends Monuments {
    private int earthAffinity;
    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.earthAffinity = earthAffinity;
    }

    public int getEarthAffinity() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return String.format("Earth Monument: %s, Earth Affinity: %d",super.getName(),this.earthAffinity);
    }
}
