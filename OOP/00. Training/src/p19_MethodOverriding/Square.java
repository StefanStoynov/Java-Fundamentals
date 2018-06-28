package p19_MethodOverriding;

public class Square extends Rectangle{
    protected double sideA;

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    protected double area() {
        return super.area();
    }
}
