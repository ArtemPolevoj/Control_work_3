package model.animals;

public class Camel extends PackAnimal{
    static int count = 0;
    int id = ++count;
    public Camel(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }
}