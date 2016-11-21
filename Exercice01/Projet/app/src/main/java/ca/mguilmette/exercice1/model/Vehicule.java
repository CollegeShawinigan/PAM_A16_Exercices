package ca.mguilmette.exercice1.model;

/**
 * Created by guilmarc on 2016-11-13.
 */

public abstract class Vehicule {

    protected String serialNumber;
    protected int maxSpeed;
    protected int speed;

    public void setSpeed(int speed) throws RunTooFastException {
        if(speed > this.maxSpeed) {
            throw new RunTooFastException("Vous allez tout casser, ralentissez !!!");
        }
        this.speed = speed;
    }

    public int getSpeed() { return speed; }

    public int getMaxSpeed() { return maxSpeed; }

    public String getSerialNumber() { return serialNumber; }

    protected abstract void Run();
}
