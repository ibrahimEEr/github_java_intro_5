package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {


    public static void main(String[] args) {

        System.out.println("-----------Task 1-------------");
        System.out.println(noDigit("123Hello World149"));

        System.out.println("-----------Task 1 Alternative Solution---");
        System.out.println(noDigit2ndWay("123Tech456Global149"));

        System.out.println("-----------Task 2-------------");
        System.out.println(noVowel("125$"));

        System.out.println("-----------Task 3-------------");
        System.out.println(sumOfDigits("John’s age is 29"));

        System.out.println("-----------Task 4-------------");
        System.out.println(hasUpperCase("$125.00"));

        System.out.println("-----------Task 5-------------");
        System.out.println(middleInt(10, 2, 30));

        System.out.println("-----------Task 6-------------");
        int[] numbers = {13, 322, 22, 13, 13, 33, 16};
        System.out.println(Arrays.toString(no13(numbers)));

        System.out.println("-----------Task 7-------------");
        int[] numbersTask7 = {13, 322, 22, 13, 13, 33, 16};


        System.out.println(factorial(5));


    }


    //Task1
    public static String noDigit(String str) {

        return str.replaceAll("\\d", "");
    }

    //Task1 Alternative solution
    public static String noDigit2ndWay(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    //Task-2
    public static String noVowel(String str) {

        return str.replaceAll("[aeiouAEIUO]", "");
    }

    // Task-3
    public static int sumOfDigits(String str) {

        if (str.length() < 1) return 0;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }

    // Task-4
    public static boolean hasUpperCase(String str) {

        boolean answer = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) answer = true;
        }
        return answer;
    }

    // Task-5
    public static int middleInt(int a, int b, int c) {
        int[] middle = {a, b, c};
        Arrays.sort(middle);
        return middle[1];
    }

    // Task-6
    public static Object[] no13(int[] numbers) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if(number != 13) result.add(number);
        }
        return result.toArray();
    }

    //Task-7
    public static void arrFactorial(int[] numbersTask7){

    }


        static int factorial(int n){
            if (n == 0) return 1;
            return n * factorial(n-1);
        }


    }






