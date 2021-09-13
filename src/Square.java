public class Square extends Rectangle {
    protected double side;
    public Square(){}
    public Square(double side)
    {
        this.side=side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", length=" + length + '}';
    }
}
