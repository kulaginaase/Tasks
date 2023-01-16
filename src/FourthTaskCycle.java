public class FourthTaskCycle {
    /**
     * Написать программу,
     * которая вам уменьшает зп с $10000 до $0 каждый месяц
     * используя циклы while/ do ... while, for. (Все три реализации).
     */

    public void getAllResults(int salary, int minimizeValue, int monthCount) {
        System.out.println("----------------------------------------");
        System.out.println("For = " + minimizeSalaryBy(salary, minimizeValue, monthCount));
        System.out.println("While = " + minimizeSalaryWhile(salary, minimizeValue, monthCount));
        System.out.println("Do while = " + minimizeSalaryDoWhile(salary, minimizeValue, monthCount));
    }

    private int minimizeSalaryBy(int salary, int minimizeValue, int monthCount) {
        for (int i = 0; i < monthCount; i++) {
            salary -= minimizeValue;
        }
        return salary;
    }

    private int minimizeSalaryWhile(int salary, int minimizeValue, int monthCount) {
        int i = 0;
        while (i < monthCount) {
            i++;
            salary -= minimizeValue;
        }
        return salary;
    }

    private int minimizeSalaryDoWhile(int salary, int minimizeValue, int monthCount) {
        int i = 0;
        do {
            i++;
            salary -= minimizeValue;
        }
        while (i < monthCount);
        return salary;
    }
}
