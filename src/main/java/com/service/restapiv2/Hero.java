package com.service.restapiv2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto id
    private int id;  // does not need to be "long", as this is only an example with small numbers

    private String firstName;
    private String lastName;
    private int heroPower; // does not need to be "long", as this is only an example with small numbers

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getHeroPower() {
        return heroPower;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setHeroPower(int maxPower) {
        Random random = new Random();
        this.heroPower = random.nextInt(maxPower);
    }
}

