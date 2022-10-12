package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                /*
                Get 2 numbers from user and find their max and min then print them with messages

                    Output:
                    "Hey user give me a number"
            -> input = 10
                    "Hey user give me another number"
            -> input = 15

                Max of your numbers is 15
                Min of your numbers is 10
                20

                */

      System.out.println("Hey user give me a number");
      int num1 = scanner.nextInt();

      System.out.println("Hey user give me another number");
      int num2 = scanner.nextInt();

      System.out.println("Hey user give me another number");
      int num3 = scanner.nextInt();

      System.out.println("Max of numbers you gave is " + Math.max(Math.max(num1, num2), num3));
      System.out.println("Min of numbers you gave is " + Math.min(Math.min(num1, num2), num3));


    }
}
