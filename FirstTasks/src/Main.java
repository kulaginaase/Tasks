public class Main {
    public static void main(String... args) {

        FirstTaskCycle firstTaskCycle = new FirstTaskCycle();
        SecondTaskCycle secondTaskCycle = new SecondTaskCycle();
        ThirdTaskCycle thirdTaskCycle = new ThirdTaskCycle();
        FourthTaskCycle fourthTaskCycle = new FourthTaskCycle();
        FifthTaskCycle fifthTaskCycle = new FifthTaskCycle();
        IfAndElse ifAndElse = new IfAndElse();
        SwitchCase switchCase = new SwitchCase();

/**0*/
        System.out.println("Hello world!");
/**1*/
        System.out.println(firstTaskCycle.allTypes());
/**2*/
        System.out.println(secondTaskCycle.stringMethods());
/**3*/
       thirdTaskCycle.getAllResults(500, 1000, 12);
/**4 - требуются уточнения по задаче */


/**5*/
       fifthTaskCycle.printCycle();
/**IfAndElse*/
        ifAndElse.runAllCases();

/**SwitchCase*/
        switchCase.runAllCases();

    }
}