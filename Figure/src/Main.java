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
        rect.perimeter();
        rect.square();
        rect.name();

        RegularHexagon regularHexagon = new RegularHexagon(5, "RegularHexagon");
        regularHexagon.perimeter();
        regularHexagon.square();
        regularHexagon.name();


//        System.out.println(regularHexagon.square() + " regularHexagon.square()");
    }
}
