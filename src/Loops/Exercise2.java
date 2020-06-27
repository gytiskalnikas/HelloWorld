package Loops;

public class Exercise2 {
    public static void main(String args[]){
        int n = 100;
        System.out.print("Even numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            //jei number%2 == 0 tai jis lygus numeris
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
