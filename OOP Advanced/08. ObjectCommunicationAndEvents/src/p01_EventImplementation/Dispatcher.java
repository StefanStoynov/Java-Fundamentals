package p01_EventImplementation;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<>();
    }

    public void addNameChangeListener(NameChangeListener nameChangeListener) {
        this.listeners.add(nameChangeListener);
    }

    public void fireNameChangeEvent() {
        NameChangeEvent nameChangeEvent = new NameChangeEvent(this, "");
        for (NameChangeListener nameChangeListener : this.listeners) {
            nameChangeListener.handleChangedName(nameChangeEvent);
        }
    }
}
