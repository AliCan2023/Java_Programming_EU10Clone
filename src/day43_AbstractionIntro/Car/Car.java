package day43_AbstractionIntro.Car;

public abstract class Car { // class should be abstract class;
    private final String brand,model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if (year <1888){
            throw new RuntimeException("Invalid year:" + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <=0){
            throw new RuntimeException("Invalid price : "+ price);
        }
        this.price = price;
    }

    public  void stop(){System.out.println("Press teh break to stop.");
    }
    public abstract void start(); //in order to create a method without body needs the keyword abstract; wants to be overridden;final key prevent the overriding;
    // details steps should be completed by child class;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}