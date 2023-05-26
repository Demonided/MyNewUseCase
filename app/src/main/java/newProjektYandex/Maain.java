import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Добро пожальвать в ресторан \"Sabor De La Vida\"");
        System.out.println("Как вас зовут?");
//        String name = scanner.next();
//        System.out.println("Привет " + name);
        System.out.println("Сколько будет человек?");
        while (true) {
            int sizePeople = scanner.nextInt();

            if (sizePeople == 1) {
                System.out.println("Хорошо");
                break;
            }
            else if (sizePeople > 1) {
                System.out.println("Будет создан счет для " + sizePeople + " человек");
                break;
            } else {
                System.out.println("Вы ввели не корректные данные, попробуйте еще раз\nСколько будет человек?");
            }
        }

        Menu clientMenu = new Menu();
        clientMenu.menuClient();

    }
}