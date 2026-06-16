class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}
public class Ex_17_ClassAndObjectCreation {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        car.displayDetails();
    }
}