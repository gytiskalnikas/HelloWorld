package Exercises;

public class Exercise9 {
    public static void main(String[] args){
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        //Stringas patikrinti ar du viršutiniai stringai baigesi (se)
        String end_str = "se";

        //Patikrint pirmu dvieju stringu pabaiga su end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        //Rodyti rezultata su endsWith
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);
    }
}
