package Exam1.Abstract;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;

    protected Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsepower(horsepower);
        this.acceleration = acceleration;
        this.setSuspension(suspension);
        this.durability = durability;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public void increaseHorcepower(int index){
        this.horsepower+=index;
    }

    public  void ingreaseSusspantion(int index){
        this.suspension+=index;
    }

    public int getOverallPerformance(){
        return (this.horsepower / this.acceleration) + (this.suspension + this.durability);
    }
    public int getEnginePerformance (){
        return this.horsepower / this.acceleration ;
    }
    public int getSuspensionPerformance(){
        return this.suspension + this.durability;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public abstract void tuneCar(Object... params);

    @Override
    public String toString() {
        return String.format("%s %s %d\n" +
                "%d HP, 100 m/h in %d s\n" +
                "%d Suspension force, %d Durability\n",
                this.brand,this.model, this.yearOfProduction,this.horsepower,this.acceleration,this.suspension, this.durability);
    }
}
