package day43_AbstractionIntro.Car;

public class CarShop {
    public static void main(String[] args) {


        //Car car1 = new Car("Ali",25,"Blue",2022,120000);//it gives the error koz of Car class is an abstract class and CANNOT create an object out of it;
        // a parent class is the base of its child classes and provides the variables and methods they need;

        Honda honda = new Honda("Accord","Black",2020,35000);
        Audi audi = new Audi("Q2","Blue",2020,38000);
        Tesla tesla = new Tesla("Model3","white",2022,55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("---------------------------------");
        // only the color and price of the Car class are the private variables with setters so that we can change them but others we cannot koz we declare them as final;


        honda.setColor("Red");
        audi.setColor("Gray");
        tesla.setColor("Black");

        honda.setPrice(30000);
        audi.setPrice(35000);
        tesla.setPrice(52000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);








    }


}
