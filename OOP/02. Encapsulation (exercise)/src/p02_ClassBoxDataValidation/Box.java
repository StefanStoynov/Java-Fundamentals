package p02_ClassBoxDataValidation;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.length = length;
        }

    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.height = height;
        }
    }

    public static double SurfaceArea(double length, double height, double width) {
        double surfaceArea = 0;
        surfaceArea = (2 * (length * width)) + (2 * (height * length)) + (2 * (height * width));
        return surfaceArea;
    }

    public static double LateralSurface(double length, double height, double width) {
        double leteralSurface = 0;
        //Lateral Surface Area = 2lh + 2wh
        leteralSurface = (2 * (length * height)) + (2 * (width * height));
        return leteralSurface;
    }

    public static double Volume(double length, double height, double width) {
        double volume = 0;
        //Volume = lwh
        volume = length * height * width;
        return volume;
    }

}
