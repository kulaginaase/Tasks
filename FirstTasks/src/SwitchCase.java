import java.util.Scanner;

public class SwitchCase {
    /**
     * Используя конструкцию для ввода данных через консоль решите следующие задачи.
     * System.out.print ("Введите ……….. ");
     * Scanner scanner = new Scanner(System.in);
     * int i = scanner.nextInt();
     * <p>
     * 1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 7, 3 или 2,
     * а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.
     * 2. Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
     * Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
     * Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 202"
     * 3. Необходимо написать программу, где бы пользователю предлагалось ввести число  303.
     * Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303".
     * Если пользователь ввёл другое число, программа вообще ничего не должна делать.
     */

    public void runAllCases() {
        enterFirstNumber();
        enterSecondNumber();
        enterThirdNumber();
    }

    private void enterFirstNumber() {
        System.out.print("Введите число 7, 3 или 2");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 7:
                System.out.println("Вы ввели число 7");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            default:
                System.out.println("Вы ввели неверное число");
                break;
        }
    }

    private void enterSecondNumber() {
        System.out.print("Введите число 202");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 202:
                System.out.println("Вы ввели число 202");
                break;
            default:
                System.out.println("Вы ввели число не равное 202");
                break;
        }
    }

    private void enterThirdNumber() {
        System.out.print("Введите число 303");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 303:
                System.out.println("Вы ввели число 303");
                break;
            default:
                break;
        }
    }
}
