import java.util.Locale;
public class SecondTask {

    /**
     * Объявить строку с вашим полным именем и вывести на экран результат
     * работы всех стандартных методов работы со строками.
     * https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/stroki
     */
    public String stringMethods() {

        String myName = "Kulagina Alisa Sergeevna";
        String anotherName = " ";

        int nameLength = myName.length();
        boolean nameNotExists = myName.isEmpty();
        boolean isTheSameName = myName.equals(anotherName);
        boolean isTheSameNameIgnoreCase = myName.equalsIgnoreCase(anotherName);
        boolean isNameContaines = myName.toUpperCase(Locale.ROOT).contains("ALISA");
        boolean isStartsWith = myName.startsWith("A", 10);
        String concatName = myName.concat("!");
        String replace = myName.replace("sa", "na");
        char charAt = myName.charAt(7);

        String secondTaskResult = nameLength + " " + nameNotExists + " " +
                isTheSameName + " " + isTheSameNameIgnoreCase + " " +
                isNameContaines + " " + isStartsWith + " " + concatName + " " +
                replace + " " + charAt;
        return secondTaskResult;
    }
}

