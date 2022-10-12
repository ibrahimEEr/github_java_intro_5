package homeworks;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("\n---------------------------TASK 1  -------------------------------\n");

        int firstNum, secondNum;

        System.out.println("Please enter two numbers : ");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();

        System.out.println("The number 1 entered by user is =" + " " + firstNum);
        System.out.println("The number 2 entered by user is =" + " " +  secondNum);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (firstNum + secondNum));


        System.out.println("\n---------------------------TASK 2  -------------------------------\n");

        int firstNumber, secondNumber;

        System.out.println("Please enter two numbers : ");

        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();


        System.out.println("The product of the given 2 numbers is: "+ firstNumber * secondNumber);




        System.out.println("\n---------------------------TASK 3  -------------------------------\n");

        double num1, num2;
        System.out.println("Please enter two floating numbers : ");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.println("The sum of the given numbers is = " +  (num1 + num2));
        System.out.println("The product of the given numbers is = " + num1 * num2);
        System.out.println("The subtraction of the given numbers is = " + (num1-num2));
        System.out.println("The division of the given numbers is = " + num1 / num2);
        System.out.println("The remainder of the given numbers is = " +  num1 % num2);


        System.out.println("\n---------------------------TASK 4  -------------------------------\n");

        System.out.println("1.\t\t" + (-10 + 7 * 5));
        System.out.println("2.\t\t" + (72+24) % 24);
        System.out.println("3.\t\t" + (10 + -3*9 / 9));
        System.out.println("4.\t\t" + (5 + 18 / 3 * 3));



        System.out.println("\n---------------------------TASK 5  -------------------------------\n");

        int i, x;

        System.out.println("Please enter two numbers ");

        i = scanner.nextInt();
        x = scanner.nextInt();

        System.out.println("The average of the given numbers is: " + (i+ x) / 2);



        System.out.println("\n---------------------------TASK 6  -------------------------------\n");

        System.out.println("Please enter 5 numbers : ");

        int numb1, numb2, numb3, numb4, numb5;

        numb1 = scanner.nextInt();
        numb2 = scanner.nextInt();
        numb3 = scanner.nextInt();
        numb4 = scanner.nextInt();
        numb5 = scanner.nextInt();


        System.out.println("The average of the given numbers is: " + (numb1+numb2+numb3+numb4+numb5) / 5);



        System.out.println("\n---------------------------TASK 7  -------------------------------\n");

        System.out.println("Please enter three numbers : ");
        int numbe1, numbe2, numbe3;

        numbe1 = scanner.nextInt();
        numbe2 = scanner.nextInt();
        numbe3 = scanner.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + numbe1*numbe1);
        System.out.println("The 6 multiplied with 6 is = " + numbe2*numbe2);
        System.out.println("The 10 multiplied with 10 is = " + numbe3*numbe3);


         System.out.println("\n---------------------------TASK 8  -------------------------------\n");

        System.out.println("Please enter the value of a side of the square");

        int sideSize = scanner.nextInt();

        System.out.println("Perimeter of the square = " + sideSize * 4);
        System.out.println("Area of the square = " + sideSize * sideSize);




        System.out.println("\n---------------------------TASK 9 --------------------------------\n");

        double annualIncome = 90_000;

        System.out.println("A Software Engineer in Test can earn " + "$" + (annualIncome *3) + " in 3 years.");




        System.out.println("\n---------------------------TASK 10  -------------------------------\n");

        String favBook, favColor;  int favNumber;

        System.out.println("PLease enter your favorite number ");
        favNumber = scanner.nextInt();

        scanner.nextLine(); // Added to take care of the scanner bug. Because there is a NextLine() after NextInt();

        System.out.println("PLease enter your favorite book name ");
        favBook = scanner.nextLine();

        System.out.println("PLease enter your favorite color ");
        favColor = scanner.next();

        System.out.println("User’s favorite book is: " + favBook + "\nUser’s favorite color is: "
                           + favColor + "\nUser’s favorite book is: " + favNumber) ;



        System.out.println("\n---------------------------TASK 11  -------------------------------\n");


        String firstName, lastName, email, address, phoneNumber;
        int age;

        System.out.println("Please enter your first name ");
        firstName = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Please enter your last name ");
        lastName = scanner.nextLine();

        System.out.println("Please enter your address ");
        address = scanner.nextLine();

        System.out.println("Please enter your email address ");
        email = scanner.nextLine();

        System.out.println("Please enter your age ");
        age = scanner.nextInt();

        scanner.nextLine(); // Added to take care of the scanner bug. Because there is a NextLine() after NextInt();

        System.out.println("Please enter your phone number ");
        phoneNumber = scanner.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". "
                            + firstName+"'s age is " + age + ". " + firstName + "'s email\naddress is "
                            + email + ", phone number is " + phoneNumber + ", and address\nis " + address + ".");


    }
    }
