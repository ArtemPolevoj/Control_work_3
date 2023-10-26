package model.animals;

public class Cat extends PetsAnimal{
    static int count = 0;
    int id = ++count;

    public Cat(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }
}
