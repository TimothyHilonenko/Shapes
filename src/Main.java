public class Main
{
    private static void PrintArea(Shape shape)
    {
        System.out.println("Area of "+shape.getClass()+" is "+shape.getArea());
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(15.0, 20.0);
        Circle c1 = new Circle(17.0);
        Square s1 = new Square(11.0);
        RectangularTriangle rt1 = new RectangularTriangle(23.0, 14.0);


        PrintArea(r1);
        PrintArea(c1);
        PrintArea(s1);
        PrintArea(rt1);
    }
}
