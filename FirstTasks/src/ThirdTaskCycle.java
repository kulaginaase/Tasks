public class ThirdTaskCycle {
    /**
     * Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
     * используя циклы while/ do ... while, for. (Все три реализации)
     */
    public void getAllResults(int salary, int raiseValue, int monthCount) {
        System.out.println("----------------------------------------");
        System.out.println("For = " + raiseSalaryBy(salary, raiseValue, monthCount));
        System.out.println("While = " + raiseSalaryWhile(salary, raiseValue, monthCount));
        System.out.println("Do while = " + raiseSalaryDoWhile(salary, raiseValue, monthCount));
    }

    private int raiseSalaryBy(int salary, int raiseValue, int monthCount) {
        for (int i = 0; i < monthCount; i++) {
            salary += raiseValue;
        }
        return salary;
    }

    private int raiseSalaryWhile(int salary, int raiseValue, int monthCount) {
        int i = 0;
        while (i < monthCount) {
            i++;
            salary += raiseValue;
        }
        return salary;
    }

    private int raiseSalaryDoWhile(int salary, int raiseValue, int monthCount) {
        int i = 0;
        do {
            i++;
            salary += raiseValue;
        }
        while (i < monthCount);
        return salary;
    }
}
