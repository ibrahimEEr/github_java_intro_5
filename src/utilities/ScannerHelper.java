package utilities;

import javax.swing.text.SimpleAttributeSet;
import java.util.Scanner;

public class ScannerHelper {

    static Scanner input = new Scanner(System.in);

    /*
    Create a method that asks user to enter a name and RETURN it
     */

    public static String getAName(){
        System.out.println("Please enter a name:");
        String name = input.nextLine();

        return name;
    }


    /*
    Create a method that asks user to enter an age and RETURN it
     */

    public static int getAnAge(){
        System.out.println("Please enter an age:");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    /*
    Create a method that asks user to enter an address and RETURN it
     */

    public static String getAnAddress(){
        System.out.println("Please enter an address:");
        String address = input.nextLine();

        return address;
    }


    public static double getUserSalary() {
        System.out.println("Please enter your salary");
        double salary = input.nextDouble();
        input.nextLine();

        return salary;
    }


    public static int getFavNo(){
        System.out.println("Hey user, please enter your favorite number ");
        int favorNum = input.nextInt();
        input.nextLine();

        return favorNum;
    }

    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }


    public static String getFavColors(){
        System.out.println("Please enter your favorite colors");
        return input.nextLine();

    }


    public static int getANumber(){
        System.out.println("Please enter an number:");
        int num = input.nextInt();
        input.nextLine();

        return num;
    }
















}