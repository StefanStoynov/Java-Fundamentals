package p01_EventImplementation;

import java.util.EventObject;

public class NameChangeEvent extends EventObject {

    private String nameChange;

    public NameChangeEvent(Object source, String nameChange) {
        super(source);
        this.nameChange = nameChange;
    }

    public String getNameChange() {
        return this.nameChange;
    }
}
