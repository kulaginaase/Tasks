public class FirstTask {
    /** Объявить переменные всех вам известных типов
     * и вывести их значения на экран.*/
    public String allTypes() {

        String food = "чашки чая";
        int foodCount = 2;
        boolean toEatOrNotToEat = true;
        char someThing = '\u0066';
        float priceDollar = 1.55F;
        double course = 67.78;
        long priceRub = (long) (priceDollar * course);
        short allMoney = 160;
        byte remainSMoney = (byte) (allMoney - priceRub);
        FirstTask self = new FirstTask();

        String firstTaskResult = foodCount + " " + food + " стоимостью " + priceDollar + " долларов, или "
                + priceRub + " рублей." + "\n" + "В кошельке осталось " + remainSMoney +
                " " + toEatOrNotToEat + " рублей... " + someThing + " -ake!" + self;

        System.out.println("----------------------------------------");

        return firstTaskResult;
    }
}
