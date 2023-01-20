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

        lightBoxes.add(emptyBox);
        lightBoxes.add(hardBox);
        lightBoxes.add(inListBox);

        for (MyBox box : lightBoxes) {
            if (box.weight > 300) {
                lightBoxes.remove(box);
                hardBoxes.add(box);
            }
        }

        System.out.println(lightBoxes.size() + " - количество легких коробок");
        System.out.println(hardBoxes.size() + " - количество тяжелых коробок");


        /** Задача с созданием класс Pet */

        HashMap<String, Pet> passportsAndNames = new HashMap<>();


    }
}