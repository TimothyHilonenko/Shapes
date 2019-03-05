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

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Circle)
        {
            return this.radius == ((Circle) obj).radius;
        }
        else
        {
            return false;
        }
    }



}
