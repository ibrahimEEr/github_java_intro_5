package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {
           

            // 1. create a scanner object
            Scanner inputReader = new Scanner(System.in);

              String fName, lName, middleName;

            System.out.println("Please enter your first name: ");
                    fName = inputReader.nextLine(); // nextLine() reads all line

            System.out.println("Please enter your middle name: ");
                    middleName = inputReader.next();    //next() reads only one word

            System.out.println("Please enter your last name: ");
                    lName = inputReader.next(); // John

            System.out.println("Your full name is = " + fName + " " + middleName+ " " + lName);














    }
}
