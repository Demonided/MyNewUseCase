import java.util.Objects;

public class Menu {
    double [] saladName = {1280.0, 1350.0, 1550.0};
    String [] saladPrice = {"Салат с сочной телятиной и ароматными грибами",
            "Салат с морепродуктами и мятым авокадо",
            "Краб и авокадо"
    };

    double [] oneDishesName = {970.0, 860.0};
    String [] oneDishesPrice = {"Суп по-сычуаньски", "Крем-суп из кукурузы с морепродуктами"};

    double [] hotDishesName = {1220.0, 1300.0, 1300.0};
    String [] hotDishesPrice = {"Томленые говяжьи щечки с солодом",
            "Сочный бифштекс под трюфельным кремом",
            "Филе дорадо с соусом бер блан"
    };

    double [] dessertName = {1380.0, 1880.0};
    String [] dessertPrice = {"Домашняя паста с подкопченной семгой",
            "Королевские гребешки с кремом из цветной капусты"
    };

    public void menuClient() {

        while (true) {
            System.out.println("Что вы будете заказывать?");
            System.out.println("1. Салат\n2. Первые блюда\n3. Горячие блюда\n4. Десерты");
            String  menuClient = Main.scanner.next();

            if (Objects.equals(menuClient, "1") || Objects.equals(menuClient, "Салат")) {

            } else {
                System.out.println("Вы ввели что не правильно, вы можете ввести название или номер блюда");
            }
        }
    }
}
