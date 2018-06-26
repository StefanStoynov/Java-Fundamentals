package p05_BorderControl;

public class Robot implements Controlable {

    private String id;
    private String model;

    public Robot(String model, String id) {

        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
