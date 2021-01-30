package Generics.example1.ex1;

import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {

       // Car car = new Car();


      //  GenericBox<Car> boxForCars = new GenericBox<>(car);
     //   Person person = new Person();

     //   GenericBox<Person> boxForPeople = new GenericBox<>(person);


        //Object leidzia deti viska i vidu
     //   GenericBox<Object> boxForEverything = new GenericBox<>(person);
     //   GenericBox<Object> boxForEverything1 = new GenericBox<>(car);

        BMW bmw = new BMW ("320","Red");
        Audi audi = new Audi ("black","Q5");
        List<Vehicle> cars = Arrays.asList(bmw,audi, new BMW("orange","X5"));

        Garage garage = new Garage((cars));
        for (Vehicle car : cars) {
            garage.repairVehicle(car);
        }



    }
}

class GenericBox<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public GenericBox(T item){
        this.item = item;
    }
}

class Car {
    @Override
    public String toString() {
        return "I am a car";
    }
}

class Person {

    @Override
    public String toString() {
        return "i am a person.";
    }
}

