package homeworks;

import utilities.ScannerHelper;

import javax.swing.*;

public class Homework04 {
    public static void main(String[] args) {


                System.out.println("--------TASK-1-----------\n");

        String name = ScannerHelper.getAName(); //Called getAName method from ScannerHelper Class

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));

        if(name.startsWith("A") || name.startsWith("a") ) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");




        System.out.println("--------TASK-2-----------\n");

        String address = ScannerHelper.getAnAddress(); //Called getAnAddress method from ScannerHelper Class

        if(address.toLowerCase().contains("chicago")){
            System.out.println("You are in the club");
        }if(address.toLowerCase().contains("des plaines")){
            System.out.println("You are welcome to join the club");
        }else System.out.println("Sorry, you will never be in the club");



        System.out.println("--------TASK-3-----------\n");

        String favColors = ScannerHelper.getFavColors();  // Used getFavColors method

        favColors = favColors.toLowerCase();

        if (favColors.contains("red") && favColors.contains("green"))  System.out.println("Green and red are in the list");
        else if (favColors.contains("red")) System.out.println("Red is in the list");
        else if (favColors.contains("green"))  System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");




        System.out.println("--------TASK-4-----------\n");

        String str = "   Java is FUN   ";

        String str1 = str.trim().substring(0,4).toLowerCase();
        String str2 = str.trim().substring(5,7).toLowerCase();
        String str3 = str.trim().substring(8).toLowerCase();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);




    }
}
