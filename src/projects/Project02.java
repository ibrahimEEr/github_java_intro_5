package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("---------------TASK 1 ----------------\n");

        System.out.println("Hello, please enter your first number");
        int firstNum = input.nextInt();
        System.out.println("Hello, please enter your second number");
        int secondNum = input.nextInt();
        System.out.println("Hello, please enter your last number");
        int thirdNum = input.nextInt();
        System.out.println("\nThe product of the numbers entered is = " + firstNum * secondNum * thirdNum);


        System.out.println("\n---------------TASK 2 ----------------\n");

        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What is your year of birth?");
        int birthYear = input.nextInt();
        int currentYear = 2022;
        System.out.println("\n" + firstName + " " + lastName + "'s age is = " + (currentYear - birthYear) + "."   );


        System.out.println("\n---------------TASK 3 ----------------\n");
        input.nextLine();
        System.out.println("What is your full name?");
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        double weight = input.nextDouble();
        System.out.println("\n" + fullName + "'s weight is = " + (weight * 2.205) + " lbs.");


        System.out.println("\n---------------TASK 4 ----------------\n");
        input.nextLine();
        System.out.println("What is your full name");
        String fName1 = input.nextLine();
        System.out.println("What is you age?");
        int age1 = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name");
        String fName2 = input.nextLine();
        System.out.println("What is your age?");
        int age2 = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name");
        String fName3 = input.nextLine();
        System.out.println("What is you age?");
        int age3 = input.nextInt();

        System.out.println(fName1 + "'s age is " + age1 + ".");
        System.out.println(fName2 + "'s age is " + age2 + ".");
        System.out.println(fName3 + "'s age is " + age3 + ".");
        System.out.println("The average age is " + (age1 + age2 + age3) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(age1 , age2), age3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(age1 , age2), age3) + ".");

    }

}