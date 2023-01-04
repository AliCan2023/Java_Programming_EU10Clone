package day43_AbstractionIntro.Car;

public final class Audi extends Car{ // in order to protect the variables or methods to be used by other classes we'd better make the class final;
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
    public void autoPark(){
        System.out.println(getBrand()+ " " +getModel()+ " has auto park feature");

    }

}
