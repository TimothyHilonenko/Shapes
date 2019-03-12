public class Main
{
    private static void PrintArea(Shape shape)
    {
        System.out.println("Area of "+shape.getClass()+" is "+shape.getArea());
    }

    public static void main(String[] args)
    {
        Circle c1 = new Circle(17.0);
        Circle c2 = new Circle(17.0);
        System.out.println("1 c1 is equal to c2 (the same radii): " + c1.equals(c2));
        c2.radius = 18;
        System.out.println("2 c1 is equal to c2 (different radii): " + c1.equals(c2));
        System.out.println("3 c1 is equal to c1 (the same radii): " + c1.equals(c1));

        Square s1 = new Square(11.0);
        Square s2 = new Square(26.0);
        System.out.println("4 s1 is equal to c1 (different shape) :" + s1.equals(c1));
        System.out.println("5 s1 is equal to s2 (different side):" + s1.equals(s2));

        Rectangle r1 = new Rectangle(15.0, 20.0);
        Rectangle r2 = new Rectangle(20.0, 15.0);

        System.out.println("hashcode r1:" + r1.hashCode());
        System.out.println("hashcode r2:" + r2.hashCode());

        System.out.println("6 r1 is equal to c1 (different shape):" + r1.equals(c1));
        System.out.println("7 r1 is equal to s1 (different shape):" + r1.equals(s1));
        System.out.println("8 r1 is equal to r1 (the same width and height):" + r1.equals(r1));
        System.out.println("r1 is equal to r2 (the same width and height):" + r1.equals(r2));

        RectangularTriangle rt1 = new RectangularTriangle(23.0, 14.0);
        RectangularTriangle rt2 = new RectangularTriangle(21.0, 17.0);
        System.out.println("rt1 is equal to rt2 (different width and height):" + rt1.equals(rt2));
        System.out.println("rt1 is equal to c1 (different shape):" + rt1.equals(c1));
        System.out.println("rt1 is equal to s1 (different shape):" + rt1.equals(s1));
        System.out.println("rt1 is equal to r1 (different shape):" + rt1.equals(r1));
        System.out.println("rt1 is equal to rt1 (the same width and height):" + rt1.equals(rt1));

        PrintArea(r1);
        PrintArea(c1);
        PrintArea(s1);
        PrintArea(rt1);
    }
}
