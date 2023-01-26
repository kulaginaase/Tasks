import java.util.HashMap;

public class Pet {
    /**
     * https://javarush.com/groups/posts/1940-klass-hashmap-
     * Создать HashMap
     * 1.	Создайте класс Pet и его наследников Cat, Dog, Parrot.
     * 2.	Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
     * а в качестве значения класс Pet.
     * 3.	Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
     */

    static HashMap<String, Pet> petHashMap = new HashMap<>();

    public static void getKeys() {
        for (String key : petHashMap.keySet()) {
            System.out.println("Ключ отображения: " + key);
        }
    }

    public static void getStringKeys() {
        System.out.println(petHashMap.keySet().toString().replaceAll("[\\[\\] ]", ""));
    }
}
