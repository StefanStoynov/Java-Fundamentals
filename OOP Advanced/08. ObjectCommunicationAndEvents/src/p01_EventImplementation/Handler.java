package p01_EventImplementation;

public class Handler implements NameChangeListener {

    @Override
    public void handleChangedName(NameChangeEvent event) {
        System.out.println(String.format("Dispatcher’s name changed to %s", event.getNameChange()));
    }
}
