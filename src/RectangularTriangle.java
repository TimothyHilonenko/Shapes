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


    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof RectangularTriangle)
        {
            return this.width == ((RectangularTriangle) obj).width  && this.height == ((RectangularTriangle) obj).height ||
                    this.width == ((RectangularTriangle) obj).height && this.height == ((RectangularTriangle) obj).width;
        }
        else
        {
            return false;
        }
    }
}