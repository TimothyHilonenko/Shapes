public class Rectangle extends Shape
{
    double width = 0;
    double height = 0;

    public Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }
}