public class Main {
    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();

/**0*/
        System.out.println("Hello world!");
/**1*/
        System.out.println(firstTask.allTypes());
/**2*/
        System.out.println(secondTask.stringMethods());
/**3*/
       thirdTask.getAllResults(500, 1000, 12);
    }
}