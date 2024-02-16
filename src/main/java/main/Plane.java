package main;

public class Plane extends Vehicle {
    Engine engine;

    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Lentokone", manufacturer, model, maxSpeed);
        this.engine = new Engine("Suihkumoottori", 500);
    }
    
    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }

}
