public class Main {
    public static void main(String[] args) {
        /**1. Реализовать интерфейс «Фигура».
         * Интерфейс содержит сигнатуры трех методов.
         * Первый метод возвращает периметр фигуры типом int.
         * Второй метод возвращает площадь фигуры типом int.
         * Третий метод возвращает имя фигуры типом String.
         2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса,
         которые реализуют интерфейс фигура.
         3. В классах должен быть конструктор,
         который на вход принимает все необходимые параметры (стороны, имя и т.д.)
         4. Создать Main класс, в котором в методе public static void main(String[] args) {}
         создать все три класса и вывести на печать результаты выполнения методов.*/

        Rect rect = new Rect(3, 4, "Rectangle");
        RegularHexagon regularHexagon = new RegularHexagon(5, "RegularHexagon");
        Square square = new Square(16, "Square");

        System.out.println(rect.perimeter() + " - периметр прямоугольника " + rect.name() + "\n" +
                rect.square() + " - площадь прямоугольника " + rect.name());
        System.out.println(regularHexagon.perimeter() + " - периметр шестиугольника " + regularHexagon.name() + "\n" +
                regularHexagon.square() + " - площадь шестиугольника " + regularHexagon.name());
        System.out.println(square.perimeter() + " - периметр квадрата " + square.name() + "\n" +
                square.square() + " - площадь квадрата " + square.name());
    }
}
