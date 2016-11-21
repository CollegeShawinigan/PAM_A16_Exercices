package ca.mguilmette.exercice1.model;

/**
 * Created by guilmarc on 2016-11-13.
 */

public class Boat extends Vehicule implements IFloatable {

    private String boatName;

    public String getBoatName() { return boatName; }

    public void setBoatName(String boatName) { this.boatName = boatName; }

    public Boat(String boatName, int maxSpeed){
        this.boatName = boatName;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void Run() {
        System.out.println("On lève l'ancre et on avance vers le large...");
    }

    @Override
    public void Float() {
        System.out.println("Ne vous inquiétez pas, je sais comment flotter !");
    }
}
