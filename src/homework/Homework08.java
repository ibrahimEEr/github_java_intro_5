package homework;

import regex.MatcherClass;
import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {

    public static void main(String[] args) {

//        //Task1
//        countConsonants("");

        //Task2
        wordArray("");


    }

    // -------------TASK 1-------------
//    public static void countConsonants(String sentence) {
//
//        String line = ScannerHelper.getAString();
//        String pattern = "(?i)[aeiou]";
//        System.out.println(line.replaceAll(pattern, "").length());
//    }




        // -------------TASK 2-------------

    public static String[] wordArray(String word){

    String text = ScannerHelper.getAString();
    String[] textArr = text.split(" " , 2);
    //String[] arr = new String[]{text};

    return textArr;


    }



//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,}");
//        String[] string_array = pattern.split(lineForTask2);
//
//        Matcher matcher = pattern.matcher(lineForTask2);
//
       // return matcher.group().split(" ");



}

