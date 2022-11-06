import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Animals {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> animals = new LinkedList<>();
    public void CollectionAnimal() {

        animals.add("Жиараф");
        animals.add("Слон");
        animals.add("Медведь");
        animals.add("Тюлень");
        animals.add("Обезьяна");
        System.out.println(animals);
    }
    public void AddAnimal() {
        System.out.println("Добавьте животное(добавление в конец)");
        animals.addLast(scanner.next());
        System.out.println(animals);
    }
    public void RemoveAnimal() {
        System.out.println("Удаление(удаление с начала)");
        animals.removeFirst();
        System.out.println(animals);
    }
}
