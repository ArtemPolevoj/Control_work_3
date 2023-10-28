import controllers.Controller;
import controllers.PetController;
import model.Registry;
import model.RegistryPets;
import repository.Database;
import repository.PetsDatabase;
import views.PetView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Database database = new PetsDatabase();
        Registry registry = new RegistryPets(database);
        Controller controller = new PetController(registry);
        SwingUtilities.invokeLater(new PetView(controller));
    }
}