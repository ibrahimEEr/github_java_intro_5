package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choosen = 5;
        int numOne = 0;
        int numTwo = 1;

        String answer = "";

        for (int i = 0; i < choosen; i++) {

            System.out.print(numOne + " - "); // first iteration 0
            int total = numOne + numTwo;
            numOne = numTwo;
            numTwo = total;

        }


//        String s = "Merhaba";
//        String rev = "";
//        for (int i = s.length() -1 ; i >= 0 ; i--) {
//            rev = rev + s.charAt(i);
//        }
//        System.out.println(rev);


    }
}