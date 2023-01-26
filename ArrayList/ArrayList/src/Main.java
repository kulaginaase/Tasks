import javax.swing.Box;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать ArrayList
         * 1.	Создать ArrayList, содержащий объекты MyBox. (Объект MyBox имеет поля вес, высота, широта, глубина)
         * 2.	Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
         * 3.	Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
         */

        ArrayList<MyBox> lightBoxes = new ArrayList<>();
        ArrayList<MyBox> hardBoxes = new ArrayList<>();

        MyBox emptyBox = new MyBox(1.55, 200, 799, 600);
        MyBox hardBox = new MyBox(300.01, 500, 600, 300);
        MyBox inListBox = new MyBox(299.99, 100, 200, 0);
        MyBox newBoxy = new MyBox(500, 700, 500, 600);

        lightBoxes.add(emptyBox);
        lightBoxes.add(hardBox);
        lightBoxes.add(inListBox);
        lightBoxes.add(newBoxy);

        for (int i = 0; i < lightBoxes.size(); i++) {
            if (lightBoxes.get(i).getWeight() > 300) {
                hardBoxes.add(lightBoxes.get(i));
                lightBoxes.remove(lightBoxes.get(i));
            }
        }

        System.out.println(lightBoxes.size() + " - количество легких коробок");
        System.out.println(hardBoxes.size() + " - количество тяжелых коробок");


        /** _____________________________________________________________
         * Задача с созданием класс Pet
         * _______________________________________________________________*/


        System.out.println("\nЗадача с созданием класс Product");

        Product doll = new Product();
        Product car = new Product();
        Product boll = new Product();

        Product.products.put("doll", doll);
        Product.products.put("car", car);
        Product.products.put("boll", boll);

        Product.getKeysAndValues();
        Product.getKeys();
    }
}