package p07_RawData;

public class Tires {
    private double tire1Presure;
    private int tire1Age;
    private double tire2Presure;
    private int tire2Age;
    private double tire3Presure;
    private int tire3Age;
    private double tire4Presure;
    private int tire4Age;

    public Tires(double tire1Presure, int tire1Age, double tire2Presure, int tire2Age, double tire3Presure, int tire3Age, double tire4Presure, int tire4Age) {
        this.tire1Presure = tire1Presure;
        this.tire1Age = tire1Age;
        this.tire2Presure = tire2Presure;
        this.tire2Age = tire2Age;
        this.tire3Presure = tire3Presure;
        this.tire3Age = tire3Age;
        this.tire4Presure = tire4Presure;
        this.tire4Age = tire4Age;
    }

    public double getTire1Presure() {
        return this.tire1Presure;
    }

    public double getTire2Presure() {
        return this.tire2Presure;
    }

    public double getTire3Presure() {
        return this.tire3Presure;
    }

    public double getTire4Presure() {
        return this.tire4Presure;
    }
}
