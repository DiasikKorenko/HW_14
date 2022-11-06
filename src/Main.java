import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Коллекция на данный момент");
        Animals animal = new Animals();
        animal.CollectionAnimal();
        Menu();
        while (true) {
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    animal.AddAnimal();
                    Menu();
                    break;
                case 2:
                    animal.RemoveAnimal();
                    Menu();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
    public static void Menu() {
        System.out.println("Меню");
        System.out.println("1.Добавить");
        System.out.println("2.Удалить");
        System.out.println("3.Завершить работу");
    }
}