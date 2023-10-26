package model.animals;

public class Donkey extends PackAnimal{
    static int count = 0;
    int id = ++count;
    public Donkey(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }
}
