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

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Square)
        {
            return this.side == ((Square) obj).side;
        }
        else
        {
            return false;
        }
    }
}
