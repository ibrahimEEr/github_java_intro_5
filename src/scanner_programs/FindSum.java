package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int num1, num2, num3;

        System.out.println("Please enter first number  :");
        num1 = input.nextInt();

        System.out.println("Please enter second number  :");
        num2 = input.nextInt();

        System.out.println("Please enter third number  :");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;


        System.out.println( "The Sum if the numbers is : " + sum);



    }
}
