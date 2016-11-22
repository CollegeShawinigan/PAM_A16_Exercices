package ca.mguilmette.exercice4.model;

import java.io.Serializable;

/**
 * Created by guilmarc on 2016-11-22.
 */


public class Contact implements Serializable {

    public static String CONTACT_KEY = "CONTACT";

    private String lastName;
    private String firstName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }
}
