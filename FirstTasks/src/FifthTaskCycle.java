import java.util.ArrayList;
import java.util.List;

public class FifthTaskCycle {
    /**Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for.*/

    public void printCycle() {
        List<Integer> cycle = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            cycle.add(i);
        }
        String print = cycle.toString().replace("[", "").replace("]", "");

        System.out.println("----------------------------------------");
        System.out.println(print);
    }
}
