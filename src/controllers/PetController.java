package controllers;

import model.FieldAnimal;
import model.ParsDate;
import model.Registry;

import java.util.HashMap;
import java.util.Scanner;

public class PetController implements Controller {
    private final Registry registry;
    private final Scanner scanner = new Scanner(System.in);

    public PetController(Registry registry) {
        this.registry = registry;

    }

    @Override
    public void addNewPet() {
        HashMap<Enum<FieldAnimal>, String> data = new HashMap<>();
        System.out.print("Введите тип питомца(dog, cat, hamster: ");
        String type = scanner.nextLine();
        if ((type.equals("dog")) || (type.equals("cat")) || (type.equals("hamster"))) {
            data.put(FieldAnimal.TYPE, type);
        } else {
            System.out.println("Введен не верный тип питомца.");
            return;
        }
        System.out.print("Введите имя питомца: ");
        data.put(FieldAnimal.NAME, scanner.nextLine());
        System.out.print("Введите дату(в формате yyyy-mm-dd): ");
        String date = scanner.nextLine();
        if (ParsDate.checkDate(date)) {
            data.put(FieldAnimal.BIRTHDATE, date);
        } else {
            System.out.println("Введена не верная дата.");
            return;
        }
        System.out.print("Введите новую команду(или команды через запятую: : ");
        data.put(FieldAnimal.COMMAND, scanner.nextLine());
        System.out.println(registry.addNewPet(data));
    }

    @Override
    public void getCommandsPet() {
        System.out.println("Питомцы: " + registry.getAllName());
        System.out.print("Введите имя питомца: ");
        System.out.println(registry.getCommandsPet(scanner.nextLine()));
    }

    @Override
    public void addNewCommand() {
        HashMap<Enum<FieldAnimal>, String> data = new HashMap<>();
        System.out.println("Питомцы: " + registry.getAllName());
        System.out.print("Введите имя питомца: ");
        data.put(FieldAnimal.NAME, scanner.nextLine());
        System.out.print("Введите новую команду(или команды через запятую: : ");
        data.put(FieldAnimal.COMMAND, scanner.nextLine());
        System.out.println(registry.addNewCommand(data));
    }

    @Override
    public void getPetsByBirthday() {
        System.out.print("Введите дату(в формате yyyy-mm-dd): ");
        System.out.println(registry.getPetsByBirthday(scanner.nextLine()));
    }

    @Override
    public void getAll() {
        System.out.println(registry.getAll());
    }

    @Override
    public void exit() {
        System.out.println("Завершение работы приложения.");
        System.exit(1);
    }
}
