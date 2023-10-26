package model.animals;

public class Horse extends PackAnimal{
    static int count = 0;
    int id = ++count;
    public Horse(String name) {
        super(name);
    }
    public int getId() {
        return id;
    }
}
