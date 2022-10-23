package projects;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("------------- TASK 1 -----------------\n");
//        System.out.println("Please enter a string");
//        String entry = input.nextLine();
//
//        if (entry.length() < 8) System.out.println("This String does not have 8 characters");
//        else {
//            String lastFourChars = entry.substring(entry.length() - 4);
//            String firstFourChars = entry.substring(0, 4);
//            String middleChars = entry.substring(4, entry.length() - 4);
//
//            System.out.println(lastFourChars + middleChars + firstFourChars);


        System.out.println("\n------------- TASK 2 -----------------\n");

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        int counter = 0;
        if (!sentence.contains(" ")){
            System.out.println("This sentence does not have 2 or more words to swap");
        }
         else for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                counter++;
            }
        System.out.println(counter);





        }
       }

