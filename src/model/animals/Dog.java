package model.animals;

public class Dog extends PetsAnimal {
    static int count = 0;
    int id = ++count;

    public Dog(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }

}
