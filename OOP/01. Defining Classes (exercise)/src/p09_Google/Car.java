package p09_Google;

public class Car {
    //> car <carModel> <carSpeed>”
    private String carModel;
    private String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
       return String.format("%s %s",this.carModel,this.carSpeed);
    }
}
