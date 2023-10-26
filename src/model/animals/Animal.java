package model.animals;

import java.util.ArrayList;
import java.util.Date;

public  abstract class Animal {
    private final String name;
    private Date birthDate;
    private final ArrayList<String> commands = new ArrayList<>();

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
    public void addCommands(String command){
        commands.add(command);
    }
    public ArrayList<String> getCommands(){
        return commands;
    }
}
