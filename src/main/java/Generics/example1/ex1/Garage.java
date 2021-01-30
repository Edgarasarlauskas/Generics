package Generics.example1.ex1;
import java.util.List;

// operate with object type T which extends class Vehicle
//priima visas masinas i garaza
public class Garage<T extends Vehicle> {


    private List<T> differentCars;


    public Garage(List<T> differentCars) {
        this.differentCars = differentCars;
    }

    public List<T> getDifferentCars() {
        return differentCars;
    }

    public void repairVehicle(Vehicle vehicle){
        System.out.println("Repairing..." + vehicle.color + " " + vehicle.brand + "car" );
    }
}
