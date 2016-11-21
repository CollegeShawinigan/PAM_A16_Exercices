package ca.mguilmette.exercice1.model;

/**
 * Created by guilmarc on 2016-11-13.
 */

public class Car extends Vehicule {

    protected CarBrandEnum brand;

     public Car(CarBrandEnum brand, int maxSpeed, String serialNumber) {
         this.brand = brand;
         this.maxSpeed = maxSpeed;
         this.serialNumber = serialNumber;
     }

    @Override
    public void Run() {
        System.out.println("Je peut rouler à " + this.maxSpeed + "km heure!");
    }
}
