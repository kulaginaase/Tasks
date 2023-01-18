import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать ArrayList
         * 1.	Создать ArrayList, содержащий объекты Box. (Объект Box имеет поля вес, высота, широта, глубина)
         * 2.	Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
         * 3.	Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
         */

        ArrayList lightBoxes = new ArrayList<Box>();
        ArrayList hardBoxes = new ArrayList<Box>();
        Box emptyBox = new Box(1.50, 200, 700, 600);
        Box hardBox = new Box(300.01, 500, 600, 300);
        Box inListBox = new Box(299.99, 100, 200, 0);
        lightBoxes.add(emptyBox);
        lightBoxes.add(hardBox);
        lightBoxes.add(inListBox);

//        public void checkWeight() {
//
//            }
//        }



    }
}