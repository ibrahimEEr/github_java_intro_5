package homework;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {

    public static void main(String[] args) {

//        //Task1
        countConsonants("");

        //Task2
        String str = ScannerHelper.getAString();
        wordArray(str);

        //Task3
        String sentence = ScannerHelper.getAString();
        removeExtraSpaces(sentence);

        //Task4
        String str4 = ScannerHelper.getAString();
        count3OrLess(str4);

        //Task5

        //Task6


    }


    // -------------TASK 1-------------
    public static void countConsonants(String sentence) {

        String line = ScannerHelper.getAString();
        String pattern = "(?i)[aeiou]";
        System.out.println(line.replaceAll(pattern, "").length());
    }


    // -------------TASK 2-------------

    public static String[] wordArray(String str) {

        String[] strArray = str.split("");

        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.asList(str));
        }
      return strArray;
    }


     //-------------TASK 3-------------

    public static void removeExtraSpaces(String line) {

        System.out.println(line.replaceAll("\\s+", " s"));
    }


    // -------------TASK 4-------------
    public static void count3OrLess(String str4){


            int counter = 0;
              String pattern = "^.{0,50}$";
            if (str4.matches(pattern)) {
                counter++;
            }
        System.out.println(counter);

            }

    // -------------TASK 5-------------

    // -------------TASK 6-------------



}








