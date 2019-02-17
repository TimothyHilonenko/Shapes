public class RectangularTriangle extends Shape
{
    double width = 0;
    double height = 0;

    public RectangularTriangle(double w, double h)
    {
        width = w;
        height = h;
    }

    @Override
    public double getArea()
    {
        return width * height / 2;
    }
}