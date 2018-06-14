package p06_RawData;

public class Tire {
    private double tire1Presure;
    private int tire1Age;
    private double tire2Presure;
    private int tire2Age;
    private double tire3Presure;
    private int tire3Age;
    private double tire4Presure;
    private int tire4Age;

    public Tire() {
    }

    public Tire(double tire1Presure, int tire1Age,
                double tire2Presure, int tire2Age,
                double tire3Presure, int tire3Age,
                double tire4Presure, int tire4Age) {
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

    public void setTire1Presure(double tire1Presure) {
        this.tire1Presure = tire1Presure;
    }

    public int getTire1Age() {
        return this.tire1Age;
    }

    public void setTire1Age(int tire1Age) {
        this.tire1Age = tire1Age;
    }

    public double getTire2Presure() {
        return this.tire2Presure;
    }

    public void setTire2Presure(double tire2Presure) {
        this.tire2Presure = tire2Presure;
    }

    public int getTire2Age() {
        return this.tire2Age;
    }

    public void setTire2Age(int tire2Age) {
        this.tire2Age = tire2Age;
    }

    public double getTire3Presure() {
        return this.tire3Presure;
    }

    public void setTire3Presure(double tire3Presure) {
        this.tire3Presure = tire3Presure;
    }

    public int getTire3Age() {
        return this.tire3Age;
    }

    public void setTire3Age(int tire3Age) {
        this.tire3Age = tire3Age;
    }

    public double getTire4Presure() {
        return this.tire4Presure;
    }

    public void setTire4Presure(double tire4Presure) {
        this.tire4Presure = tire4Presure;
    }

    public int getTire4Age() {
        return this.tire4Age;
    }

    public void setTire4Age(int tire4Age) {
        this.tire4Age = tire4Age;
    }
}
