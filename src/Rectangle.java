import java.util.Objects;

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

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            return this.width == ((Rectangle) obj).width  && this.height == ((Rectangle) obj).height ||
                    this.width == ((Rectangle) obj).height && this.height == ((Rectangle) obj).width;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        if(width < height)
        {
            return Objects.hash(width, height);
        }
        else
        {
            return Objects.hash(height, width);
        }
    }
}