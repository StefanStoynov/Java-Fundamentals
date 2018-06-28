package p19_MethodOverriding;

public class Rectangle  {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    protected double area (){
        return this.sideA * this.sideB;
    }
}
