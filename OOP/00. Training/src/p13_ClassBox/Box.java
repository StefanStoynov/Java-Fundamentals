package p13_ClassBox;

public class Box {
    //length, width and height
    private double length;
    private double width;
    private double height;

    protected Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double lateralSurfaceArea() {
        double lateralSurfaceArea = 0;
        //Lateral Surface Area = 2lh + 2wh
        return lateralSurfaceArea = (2 * this.length * this.height) + (2 * this.width * this.height);
    }

    public double surfaceArea() {
        double surfacearea = 0;
        //Surface Area = 2lw + 2lh + 2wh
        return surfacearea = lateralSurfaceArea() + (2 * this.length * this.width);
    }


    public double volume() {
        double volume;
        // Volume = lwh

        return volume = this.length * this.width * this.height;
    }
}
