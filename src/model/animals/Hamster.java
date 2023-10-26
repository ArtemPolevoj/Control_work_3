package model.animals;

public class Hamster extends PetsAnimal{
    static int count = 0;
    int id = ++count;
    public Hamster(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }
}
