public class Circle extends Shape
{
    double radius = 0;

    public Circle (double r)
    {
        radius = r;
    }

    @Override
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
}
