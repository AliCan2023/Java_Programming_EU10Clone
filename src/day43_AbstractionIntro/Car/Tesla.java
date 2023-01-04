package day43_AbstractionIntro.Car;

public final class Tesla extends Car { // this class cannot be parent class but can be CHILD class;


    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);

    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");

    }
    public void autoPilot(){

}
}
