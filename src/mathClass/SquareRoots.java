package mathClass;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {

     int number1 = 81;
     int number2 = 25;
     int number3 = 64;

     System.out.println("Root of number is " + Math.sqrt(number1));
     System.out.println("Root of number 2 is " + Math.sqrt(number2));
     System.out.println("Root of number 3 is " + Math.sqrt(number3));


     // Asagidaki gibi de olur. Yukarida int verip double aldik cunku double daha genis intten.
     double a = Math.sqrt(36);
     System.out.println(a);

        Scanner inputTaker = new Scanner(System.in);
        System.out.println("Give me a number");
        double userNumber = inputTaker.nextDouble();

        System.out.println("Sqrt is " + Math.sqrt(userNumber));











    }
}
