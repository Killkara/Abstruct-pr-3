public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length)
    {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length, String color, boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle S= "+getArea()+" P= "+getPerimeter();
    }
}
