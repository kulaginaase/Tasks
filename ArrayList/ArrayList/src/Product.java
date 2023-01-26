import java.util.HashMap;

public class Product {
    /**
     * Создать HashMap
     * 1.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
     * 2.	Перебрать и распечатать пары значений - entrySet().
     * 3.	Перебрать и распечатать набор из имен продуктов  - keySet().
     * 4.	Перебрать и распечатать значения продуктов - values().
     * 5.	Для каждого перебора создать свой метод.
     */

    String name;

    static HashMap<String, Product> products = new HashMap<>();

    public static void getKeysAndValues() {
        for (HashMap.Entry<String, Product> entry: products.entrySet()) {
            System.out.println("⚽️ " + entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void getKeys() {
        for (String key: products.keySet()) {
            System.out.println("🏀️ " + key);
        }
    }
}