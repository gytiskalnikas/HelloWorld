package Exercises;

public class Exercise8 {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        //Palyginti du stringus
        int result = str1.compareToIgnoreCase(str2);

        //Rodyti palygintų rezultatą
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" +str2 + "\"");
        }
        else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is equal to" +
                    "\"" + str2 + "\"");
        }
        else //jei (rezultatas > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }
}
