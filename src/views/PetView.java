package views;

import controllers.Controller;

import java.util.Scanner;

public class PetView implements View {
    private final Controller controller;

    public PetView(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("*** Реестр домашних питомцев ***");
            System.out.println("================================");
            System.out.println("0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ.");
            System.out.println("1. Добавить нового питомца.");
            System.out.println("2. Получить список команд питомца.");
            System.out.println("3. Обучить питомца новым командам.");
            System.out.println("4. Получить список питомцев по дате рождения.");
            System.out.println("5. Получить базу питомцев.");
            System.out.print("Пожалуйста, выберите пункт меню: ");
            int number = scanner.nextInt();
            switch (number) {
                case 0:
                    controller.exit();
                    break;
                case 1:
                    controller.addNewPet();
                    break;
                case 2:
                    controller.getCommandsPet();
                    break;
                case 3:
                    controller.addNewCommand();
                    break;
                case 4:
                    controller.getPetsByBirthday();
                    break;
                case 5:
                    controller.getAll();
                    break;
                default:
                    System.out.println("Укажите корректный пункт меню.");
            }
        }
    }
}
