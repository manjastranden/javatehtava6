package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        String typeString = sc.nextLine();
                        int type = Integer.parseInt(typeString);
                        System.out.println("Anna kulkuneuvon valmistaja:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        String maxSpeed = sc.nextLine();
                        int maxSpeedint = Integer.parseInt(maxSpeed); 
                        
                        if(type==1) {
                            Vehicle vehicle= new Car(manufacturer, model, maxSpeedint);
                            vehicles.add(vehicle);
                        } else if (type == 2) {
                            Vehicle vehicle = new Plane(manufacturer, model, maxSpeedint);
                            vehicles.add(vehicle);
                        } else if (type == 3) {
                            Vehicle vehicle = new Ship(manufacturer, model, maxSpeedint);
                            vehicles.add(vehicle);
                        }
                        break;

                    case 2:
                        listVehicles();
                        break;
                    case 3:
                        driveCars();
                        break;
                    case 4:
                        flyPlanes();
                        break;
                    
                    case 5:
                        sailShips();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit=true;
                        break;
                    default:
                        System.out.println("Virheellinen valinta!");
                }

            }
        } sc.close();
    } public static void listVehicles () {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.vehicleType+ ": "+vehicle.manufacturer+" "+ vehicle.model );
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle; //tämän kohdan sain korjattua chat gpt avulla.
                System.out.println("Moottori: "+car.engine.engineName+" "+ car.engine.power +"kW");
            } else if (vehicle instanceof Plane) {
                Plane plane = (Plane) vehicle;
                System.out.println("Moottori: "+plane.engine.engineName+" "+ plane.engine.power +"kW");
            } else if (vehicle instanceof Ship) {
                Ship ship = (Ship) vehicle;
                System.out.println("Moottori: "+ship.engine.engineName+" "+ ship.engine.power +"kW");
            } else {
                System.out.println("Moottoria ei ole asetettu.");
            }
            
            System.out.println("Huippunopeus: " + vehicle.maxSpeed + "km/h");
            
            
        }

    } public static void driveCars() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive();
            }
        }
    
    } public static void flyPlanes() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Plane) {
                Plane plane = (Plane) vehicle;
                plane.fly();
            }
        }
        
    } public static void sailShips() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Ship) {
                Ship ship= (Ship) vehicle;
                ship.sail();
            }
        }       
    }

    
}
