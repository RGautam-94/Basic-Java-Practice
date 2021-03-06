package geometric;

import java.util.Date;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Return Area
    public double getArea(){
        return radius*radius*Math.PI;
    }
    // Return perimeter
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    // Circle info
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is: " + radius );
    }
}
