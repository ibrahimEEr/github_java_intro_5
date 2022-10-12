package projects;

import java.util.Random;
import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");

        String s1 = "24" , s2 = "5";

        System.out.println("The sum of " + s1 + " and " + s2 + " is = "
                        + (Integer.parseInt(s1) + Integer.parseInt(s2)));

        System.out.println("The subtraction of " + s1 + " and " + s2 + " is = "
                         + (Integer.parseInt(s1) - Integer.parseInt(s2)));

        System.out.println("The division of " + s1 + " and " + s2 + " is = "
                         + Double.parseDouble(s1) / Double.parseDouble(s2));

        System.out.println("The multiplication of " + s1 + " and " + s2 + " is = "
                + Integer.parseInt(s1) * Integer.parseInt(s2));

        System.out.println("The multiplication of " + s1 + " and " + s2 + " is = "
                + Integer.parseInt(s1) % Integer.parseInt(s2));


        System.out.println("\n------------TASK-2------------\n");

        double random = (Math.random() * 35) +1;
        int intRandom = (int) random;


        if (intRandom == 2 || intRandom == 3 || intRandom ==5 || intRandom == 7 || intRandom == 11
           || intRandom == 13 || intRandom == 17 || intRandom == 19 || intRandom == 23 ||
                intRandom == 29 || intRandom == 31)
            System.out.println(intRandom + " IS A PRIME NUMBER");
        else
            System.out.println(intRandom + " IS NOT A PRIME NUMBER");


        System.out.println("\n------------TASK-3------------\n");

       double random1 = (Math.random() * (50)) + 1;
       double random2 = (Math.random() * (50)) + 1;
       double random3 = (Math.random() * (50)) + 1;

       if((random1 < random2) && (random1 < random3))  {
           System.out.println("Lowest number is = " + (int)random1);
       } else if ((random1 < random2) && (random1 > random3)) {
           System.out.println("Middle number is = " + (int)random1);
       }else if ((random1 > random2) && (random1 > random3)){
           System.out.println("Highest number is = " + (int)random1);
       } else if ((random2 < random1) && (random2 < random3)) {
           System.out.println("Lowest number is = " + (int)random2);
       } else if ((random2 < random1) && (random2 > random3)) {
           System.out.println("Middle number is = " + (int)random2);
       } else if ((random2 > random1) && (random2 > random3)) {
           System.out.println("Largest number is = " + (int)random2);
       }else if ((random3 < random1) && (random3 < random2)){
           System.out.println("Lowest number is = " + (int)random3);
       } else if ((random3 > random1) && (random3 < random2)) {
           System.out.println("Middle number is = " + (int)random2);
       } else if ((random3 > random1) && (random3 > random2)) {
           System.out.println("Largest number is = " + (int)random2);
       }


        System.out.println("\n------------TASK-4------------\n");

        char i = 'R';

        if (((int) i >= 65 && (int) i <=90) || ((int) i >= 97 && (int) i <= 122)) {

            if ((int) i == 65 || (int) i == 69 || (int) i == 73 || (int) i == 79 || (int) i == 85){
                System.out.println("The letter is uppercase");
            }else System.out.println("The letter is lowercase");
        }else
            System.out.println("Invalid character detected!!!!");



        System.out.println("\n------------TASK-5------------\n");

        char c = 'K';

        if (((int) c >= 65 && (int) c <=90) || ((int) c >= 97 && (int) c <= 122)) {

            if ((int) c == 65 || (int) c == 69 || (int) c == 73 || (int) c == 79 || (int) c == 85
                    || (int) c == 97 || (int) c == 101 || (int) c == 105 || (int) c == 111 || (int) c == 117){
                System.out.println("The letter is vowel");
            }else System.out.println("The letter is consonant");
           }
        else System.out.println("Invalid character detected!!!!");


        System.out.println("\n------------TASK-6------------\n");

        char z = '!';

        if (((int) z >= 32 && (int) z <= 47) || ((int) z >= 58 && (int) z <= 64) ||
            ((int) z >= 123 && (int) z <= 126)){
            System.out.println("Special character is = " + z);
        }else System.out.println("Invalid character detected!!!");


        System.out.println("\n------------TASK-7------------\n");

        char x = '@';

        if (((int) x >= 65 && (int) x <=90) || ((int) x >= 97 && (int) x <= 122) || ((int) x >= 97 && (int) x <= 122)){
            System.out.println("Character is a letter");
        }else if ((int) x >= 48 && (int) x <=57) {
            System.out.println("Character is a digit");
        }else System.out.println("Character is a special character");


}
    }