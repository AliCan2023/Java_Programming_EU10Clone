package day45_Abstraction_Interface_Continue.Shape;

public class Circle extends Shape { // first call the abstract class method second call the constructor;
    private double radius;// gotta be encapsulated;
    private static final double pi = 3.14;

    public Circle(double radius) {//(String name,) has deleted koz the name of the subclass is certain which is Circle;
        super("Circle");// super keyword used calling the parent class constructor;
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            throw new RuntimeException("Invalid Radius: " + radius);
        //this.radius = radius;
        setRadius(radius);// to check the condition of the radius using set method is more secured way;
    }

    @Override
    public double area() {

        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
