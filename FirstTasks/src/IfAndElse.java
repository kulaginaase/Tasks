import java.util.Scanner;

public class IfAndElse {
    /**
     * Используя конструкцию для ввода данных через консоль решите следующие задачи.
     * System.out.print ("Введите ……….. ");
     * Scanner scanner = new Scanner(System.in);
     * int i = scanner.nextInt();
     * <p>
     * 1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
     * 5, 4 или 1, а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.
     * 2. Необходимо написать программу, где бы пользователю предлагалось ввести число  101.
     * Если пользователь ввёл число 101, программа должна вывести сообщение: "Вы ввели число 101".
     * Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 101"
     * 3. Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
     * Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
     * Если пользователь ввёл другое число, программа вообще ничего не должна делать.
     */

    public void runAllCases() {
        System.out.println("----------------------------------------");
        enterFirstNumberIfAndElse();
        System.out.println("----------------------------------------");
        enterSecondNumberIfAndElse();
        System.out.println("----------------------------------------");
        enterThirdNumberIfAndElse();
    }
    private void enterFirstNumberIfAndElse() {

        System.out.print("Введите число 5, 4 или 1");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 5) {
            System.out.println("Вы ввели число 5");
        } else if (i == 4) {
            System.out.println("Вы ввели число 4");
        } else if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели неверное число, запустите программу ещё раз и введите число 5, 4 или 1");
        }
    }

    private void enterSecondNumberIfAndElse() {
        System.out.print("Введите число 101");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 101) {
            System.out.println("Вы ввели число 101");
        } else {
            System.out.println("Вы ввели число не равное 101");
        }
    }

    private void enterThirdNumberIfAndElse() {
        System.out.print("Введите число 202");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 202) {
            System.out.println("Вы ввели число 202");
        }
    }
}
