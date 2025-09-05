class Car {
    // Define the properties
    // brand, model and year
    private String brand,model;
    int year;
    // Constructor
    public Car(String brand,String model,int year) {
        // Initialize brand, model, and year
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    // Method to display details
    public void displayDetails() {
        
        // Print car details in the specified format
        System.out.println("Car Details:");
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
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