package homework;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
           System.out.println("--------TASK 1--------\n");
            for (int i = 1; i <=100 ; i++) {
            String result = i + " - ";
            if (i == 98) System.out.println(result.substring(0, result.length() - 3));
            else if (i % 7 == 0) System.out.print(i + " - ");
            }

        System.out.println("\n--------TASK 2--------\n");

        for (int i = 1; i <=50 ; i++) {
            String result1 = i + " - ";
            if (i == 48) System.out.print(result1.substring(0, result1.length()-3));
            else if(i %6 == 0) System.out.print(i + " - ");
        }

        System.out.println("\n\n--------TASK 3--------\n");

        for (int i = 100; i >= 50 ; i--) {
            String result2 = i + " - ";
           if(i == 50) System.out.println(result2.substring(0, result2.length()-3));
            else if (i %5 == 0) System.out.print(i + " - ");
        }

        System.out.println("\n--------TASK 4--------\n");
        /*"Write a program that prints the squares of all numbers starting from
        0 to 7 (0 and 7 are included)"*/

        for (int i = 1; i <=7 ; i++) {
            System.out.println("The square of 0 is = " + i * i);
        }

        System.out.println("\n--------TASK 5--------\n");
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n--------TASK 6--------\n");

        System.out.println("Please enter a positive number");
        int number3 = input.nextInt();
        input.nextLine();
        int fact = 1;
        for (int i = 1; i <= number3 ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);


        System.out.println("\n--------TASK 7--------\n");


        System.out.print("Please enter your full name ");
        String str = input.nextLine().toLowerCase();
        int counter = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
           }
          }
           System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n--------TASK 8--------\n");

        System.out.println("Please enter a number");

        int givenNumOne = input.nextInt();
        input.nextLine();

        if(givenNumOne >= 100) System.out.println("This number is already more than 100");

        while(givenNumOne < 100 ) {
            System.out.println("This number is not more than or equal to 100, please enter another number");
            int givenNumTwo = input.nextInt();
            input.nextLine();
            int totalTwo = givenNumOne + givenNumTwo;
            if (totalTwo >= 100) {
             System.out.println("Sum of the entered numbers is at least 100");
            }
            break;
        }


              System.out.println("\n--------TASK 9--------\n");

        int n = 5;
        int firstNum =  0;
        int secondNum = 1;
        int SumPreviousTwo;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " - ");
            SumPreviousTwo = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = SumPreviousTwo;
        }

        System.out.println("\n\n--------TASK 10--------\n");

        System.out.println("Please enter a name");
        String fName = input.nextLine();

        for (;;) {
            if (fName.charAt(0) == 'j' || fName.charAt(0) == 'J') {
                System.out.println("End of the program");
                break;
            }else {
                System.out.println("Please enter a new name");
                fName = input.nextLine();
            }
        }

    }
}
