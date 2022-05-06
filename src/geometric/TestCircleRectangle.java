package geometric;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println("The circle "+c.toString());
        System.out.println("The radius is: " + c.getRadius());
        System.out.println("The diameter is: " + c.getDiameter());
        System.out.println("The area is: " + c.getArea());


        Rectangle r = new Rectangle(2,4);
        System.out.println("\nThe rectangle "+r.toString());
        System.out.println("The area is: " +r.getArea());
        System.out.println("The perimeter is: " + r.perimeter());

    }
}
