package p14_ClassBoxDataValidation;

public class Box {
    public static final String INVALID_WIDTH_MESSAGE = "Width cannot be zero or negative.";
    public static final String INVALID_HEIGHT_MESSAGE = "Height cannot be zero or negative.";
    public static final String INVALID_LENGTH_MESSAGE = "Length cannot be zero or negative.";

    //length, width and height
    private double length;
    private double width;
    private double height;


    protected Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(INVALID_WIDTH_MESSAGE);
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(INVALID_HEIGHT_MESSAGE);
        }
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
