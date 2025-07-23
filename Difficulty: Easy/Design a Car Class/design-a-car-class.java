class Car {
    // Properties
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize brand, model, and year
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}


class Solution {
    public void fun(String brand, String model, int year) {
        // Create Car class and
        // call displayDetails() method

        Car car = new Car(brand, model, year);
        car.displayDetails();
    }
}