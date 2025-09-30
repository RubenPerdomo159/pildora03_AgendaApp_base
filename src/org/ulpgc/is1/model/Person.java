package org.ulpgc.is1.model;

public class Person extends Contact {
    public String firstName;
    public String lastName;

    public Person(String telephone, String email, String firstName, String lastName) {
        super(telephone, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
}
