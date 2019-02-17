public class Square extends Shape
{
    double side = 0;

    public Square (double s)
    {
        side = s;
    }

    @Override
    public double getArea()
    {
        return Math.pow(side, 2);
    }
}
