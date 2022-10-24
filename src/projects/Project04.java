package projects;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------- TASK 1 -----------------\n");
        System.out.println("Please enter a string");
        String entry = input.nextLine();

        if (entry.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            String lastFourChars = entry.substring(entry.length() - 4);
            String firstFourChars = entry.substring(0, 4);
            String middleChars = entry.substring(4, entry.length() - 4);

            System.out.println(lastFourChars + middleChars + firstFourChars);
        }

            System.out.println("\n------------- TASK 2 -----------------\n");

            System.out.println("Please enter a word");
            String sentence = input.nextLine();
            String lastWord = "";
            String firstWord = "";
            String midWords = "";

            if (!sentence.contains(" "))
                System.out.println("This sentence does not have 2 or more words to swap");
            else {
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ')
                        firstWord = sentence.substring(0, sentence.indexOf(' '));
                    lastWord = sentence.substring(sentence.lastIndexOf(' ') + 1);
                    midWords = sentence.substring(sentence.indexOf(' ') + 1, sentence.lastIndexOf(' '));
                }

            }
            System.out.println(lastWord + " " + midWords + " " + firstWord);


            System.out.println("\n------------- TASK 3 -----------------\n");

            String str1 = "These books are so stupid";
            String str2 = "I like idiot behaviors";
            String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

            for (int i = 0; i < str1.length(); i++) {
                if (str1.contains("stupid")) str1 = str1.replaceAll("stupid", "nice");
                if (str2.contains("idiot")) str2 = str2.replaceAll("idiot", "nice");
                if (str3.contains("stupid")) str3 = str3.replace("stupid", "nice");
                if (str3.contains("idiot")) str3 = str3.replace("idiot", "nice");
            }
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);

            System.out.println("\n------------- TASK 4 -----------------\n");

            String name = ScannerHelper.getAName();
            int mid = name.length() / 2;
            String middle2 = name.substring(name.length() / 2 - 1, name.length() / 2 + 1);

            if (name.length() < 2) System.out.println("Invalid Input!!!");
            else {
                if (name.length() % 2 == 1) {
                    System.out.println(name.charAt(mid));
                } else {
                    System.out.println(middle2);
                }
            }

            System.out.println("\n------------- TASK 5 -----------------\n");

            System.out.println("Please enter a country name");
            String country = input.nextLine();
            int middle = country.length() / 2;

            if (country.length() < 5) {
                System.out.println("Invalid output!!!");
            } else {
                System.out.println(country.substring(middle - 1, middle + 1));
            }


            System.out.println("\n------------- TASK 6 -----------------\n");

            String address = ScannerHelper.getAnAddress();

            address = address.replace('a', '*');
            address = address.replace('A', '*');
            address = address.replace('e', '#');
            address = address.replace('E', '#');
            address = address.replace('i', '+');
            address = address.replace('I', '+');
            address = address.replace('u', '$');
            address = address.replace('U', '$');
            address = address.replace('o', '@');
            address = address.replace('O', '@');
            System.out.println(address);

            System.out.println("\n------------- TASK 7 -----------------\n");

            int random1 = RandomNumberGenerator.getARandomNumber(0, 25);
            int random2 = RandomNumberGenerator.getARandomNumber(0, 25);
            System.out.println("random1 = " + random1);
            System.out.println("random2 = " + random2);

            for (int i = random1; i <= random2; i++) {

                if (i % 5 != 0) System.out.println(i);
            }


            System.out.println("\n------------- TASK 8 -----------------\n");

            String entry1 = ScannerHelper.getAString();
            int counter = 0;
            if (!entry1.contains(" ")) {
                System.out.println("This sentence does not have multiple words");
            } else {
                for (int i = 0; i < entry1.length(); i++) {
                    if (entry1.charAt(i) == ' ') counter++;
                }
                counter += 1;
                System.out.println("This sentence has " + counter + " words");
            }


            System.out.println("\n------------- TASK 9 -----------------\n");

            int givenNum = ScannerHelper.getANumber();


            for (int i = 1; i <= givenNum; i++) {
                if (i % 6 == 0) System.out.println("FooBar");
                else if (i % 3 == 0) System.out.println("Bar");
                else if (i % 2 == 0) System.out.println("Foo");
                else System.out.println(i);
            }

            System.out.println("\n------------- TASK 10 -----------------\n");

            String word3 = ScannerHelper.getAString();
            int length = word3.length();
            String newWord = "";

            if (word3.length() < 1) System.out.println("This word does not have 1 or more characters");

            for (int i = length - 1; i >= 0; i--) {
                newWord = newWord + word3.charAt(i);
            }
            if (word3.equals(newWord)) {
                System.out.println("The string is palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }


            System.out.println("\n------------- TASK 11 -----------------\n");

            String word4 = ScannerHelper.getAString();

            int aCount = 0;

            if (word4.length() < 1) System.out.println("This sentence does not have any characters");

            for (int i = 0; i < word4.length(); i++) {

                if (word4.charAt(i) == 'a' || word4.charAt(i) == 'A') {
                    aCount++;
                }
            }
            System.out.println("This sentence has " + aCount + " a or A letters.");


    }
}