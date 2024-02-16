package main;

public class Vehicle {
    protected String vehicleType;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;

    public Vehicle(String vehicleType, String manufacturer, String model, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;

    }


   
   // Engine engine;

    

   //  public String getManufacturer() { */
  //      return manufacturer;
  //  }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

 




  
}  