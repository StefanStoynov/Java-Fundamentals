package p09_TrafficLights;

public class TraficLight {
    private Signal signal;

    public TraficLight(String signal) {
        this.signal = Signal.valueOf(signal);
    }

    public void changeSignal() {
        this.signal = Signal.values()[(this.signal.ordinal()+2) % 3];
    }

    @Override
    public String toString() {
        return signal.name();
    }
}
