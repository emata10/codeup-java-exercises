package shapes;

public abstract class Quadrilateral {

    public abstract double getArea();

    abstract class Shape {
        abstract double getArea();
    }

    interface Measurable {
        double getPerimeter();
    }

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width, double side, double v) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
    }

    public void setWidth(double width) {
    }

}
