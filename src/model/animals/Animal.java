package model.animals;

import java.util.Date;

public  abstract class Animal {
    private final String name;
    private Date birthDate;


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
