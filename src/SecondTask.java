import java.util.ArrayList;
import java.util.Locale;
public class SecondTask {

    /**
     * Объявить строку с вашим полным именем и вывести на экран результат
     * работы всех стандартных методов работы со строками.
     * https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/stroki
     */
    public String stringMethods() {

        String myName = "Kulagina Alisa Sergeevna";
        String anotherName = "Elena";
        String myNewName = "";

        int nameLength = myName.length();
        boolean nameNotExists = myName.isEmpty();
        boolean isTheSameName = myName.equals(anotherName);
        boolean isTheSameNameIgnoreCase = myName.equalsIgnoreCase(anotherName);
        boolean isNameContaines = myName.toUpperCase(Locale.ROOT).contains("ALISA");
        boolean isStartsWith = myName.startsWith("A", 10);
        String concatName = myName.concat("!");
        String replace = myName.replace("sa", "na");
        char charAt = myName.charAt(7);

        char[] newName = myName.toCharArray();
        anotherName.getChars(0, 5, newName, 9);
        for (int i = 0; i < newName.length; i++) {
            myNewName += newName[i];
        }

        String secondTaskResult = "Длина имени - " + nameLength + " символов" + "\n" +
                "Имя не существует? " + nameNotExists + "\n" +
                "Это имя - " + anotherName + "? " + isTheSameName + "\n" +
                "Это имя - " + anotherName.toUpperCase() + "? " + isTheSameNameIgnoreCase + "\n" +
                "Это имя - ALISA? " + isNameContaines + "\n" +
                "Это имя начинается с 'Ж'? " + isStartsWith + "\n" +
                "Добавить в конце '!' " + concatName + "\n" +
                "Заменить 'са' на 'на' " + replace + "\n" +
                "Выбрать 8-ой символ в имени - " + charAt + "\n" +
                "Заменить имя на Елена " + myNewName;

        System.out.println("----------------------------------------");
        return secondTaskResult;
    }
}

