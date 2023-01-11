package day45_Abstraction_Interface_Continue.Shape;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();// different shape has different area that's why we make this method instance first but i can make it abstract to let the subs take care of the details of the methods;


    public abstract double perimeter(); // same here;

    @Override
    public String toString() {
        return getClass().getSimpleName()+  "{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
