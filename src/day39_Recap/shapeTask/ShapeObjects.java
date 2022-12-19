package day39_Recap.shapeTask;

public class ShapeObjects {// you have to be able to tell which variables are inherited which are not;this is really important for OOP;

    public static void main(String[] args) {
//Square Object:
        Square square = new Square(10);// in the Square class we only have one argument;

        System.out.println(square);//exit code is 1 koz something went wrong here.if nothing is wrong with the code the exit code is 0;

        // square.side = 30; variable side we declared it as private that's why we use setter;
        //square.side =-1000;//if the Variable is not private we cannot set the condition in Square Class;so only through Square.setSide(); we can call and set the side var;
        square.setSide(15);

        System.out.println(square);

        System.out.println(square.getName());

        System.out.println("------------------------");

// rectangle object:
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println(rectangle);

        rectangle.setLength(10);// If I wanna change the length call this method;

        System.out.println(rectangle.getLength());// if I want to read the value through this method;

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("------------------------");

        // Circle object:

        Circle circle = new Circle(8.5);//if I give -15 as soon as the setter condition finds this situation the code is terminated with exit code 1;


        System.out.println(circle);

        //circle.radius = 15.5;// since thi variable is private we have to cal the setter;

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());

        System.out.println(circle);

        System.out.println(circle.getName());


    }
}
