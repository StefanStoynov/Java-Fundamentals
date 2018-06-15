package p01_ClassBox;

public class Box{

        private double lenght;
        private double width;
        private double height;

        public Box(double lenght, double width, double height) {
                this.lenght = lenght;
                this.width = width;
                this.height = height;
        }

        private double getLenght() {
                return this.lenght;
        }

        private void setLenght(double lenght) {
                this.lenght = lenght;
        }

        private double getWidth() {
                return this.width;
        }

        private void setWidth(double width) {
                this.width = width;
        }

        private double getHeight() {
                return this.height;
        }

        private void setHeight(double height) {
                this.height = height;
        }

        public static double SurfaceArea(double lenght,double height,double width){
                double surfaceArea =0;
                surfaceArea = (2*(lenght*width))+(2*(height*lenght))+(2*(height*width));
                return surfaceArea;
        }
        public static  double LateralSurface(double lenght,double height, double width){
                double leteralSurface = 0;
                //Lateral Surface Area = 2lh + 2wh
                leteralSurface =(2*(lenght*height))+(2*(width*height));
                return  leteralSurface;
        }
        public static double Volume(double lenght, double height, double width){
                double volume = 0;
                //Volume = lwh
                volume = lenght*height*width;
                return volume;
        }

}
