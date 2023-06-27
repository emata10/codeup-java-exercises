package shapes;
public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        super(side, side, side, side);
        this.side = side;
    }

    public void setLength(double side) {
        super.setLength(side);
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}



