package ca.mguilmette.exercice1.model;

/**
 * Created by guilmarc on 2016-11-13.
 */

public enum CarBrandEnum {

    Toyota("Aujourd'hui Demain Toyota"),
    Mazda("Vroum-Vroum"),
    Nissan("Innover autrement"),
    BMW("Le luxe à votre portée"),
    Ford("Vous emmener plus loin"),
    Williams("Écurie de courses révolutionnaire"),
    Ferrari("J'ai pas les moyens!");

    private String slogan;

    CarBrandEnum(String slogan){
        this.slogan = slogan;
    }

    public String toString() {
        return "I'm proud to say you:" + slogan;
    }
}