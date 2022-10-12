package methods;

import utilities.PrintUtils;

public class PrintPractise {
    public static void main(String[] args) {

        PrintUtils myPrinter = new PrintUtils();

        myPrinter.printHello(); // Hello


        PrintUtils.printName("Vlad");
        PrintUtils.printName("Viktoriia");
        PrintUtils.printName("John");

    }
}
