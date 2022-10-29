package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("---------------TASK 1!!!----------------\n");
        int[] numbers = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);


        System.out.println("\n---------------TASK 2 --------------\n");
        int[] numbers1 = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallest(numbers1);

        System.out.println("\n---------------TASK 3 --------------\n");
        int[] numbers3 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers3);

        System.out.println("\n---------------TASK 4 --------------\n");
        int[] numbers4 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numbers4);

        System.out.println("\n---------------TASK 5 --------------\n");

        String[] str = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(str);

        System.out.println("\n---------------TASK 6 --------------\n");

        String[] stationary = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(stationary);


    }


                    //TASK-1
    public static void findGreatestAndSmallestWithSort(int[] numbers) {

        Arrays.sort(numbers);
        if (numbers.length > 0) {
            System.out.println("Max = " + numbers[numbers.length - 1]);
            System.out.println("Min = " + numbers[0]);
        } else {
            System.out.println("Array is empty!");
        }

    }

                    //TASK-2
    public static void findGreatestAndSmallest(int[] numbers) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        if (numbers.length > 0) {
            System.out.println("Max is = " + max);
            System.out.println("Min is = " + min);
        } else {
            System.out.println("Array is empty!");
        }

    }

                    //TASK-3
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {

        Arrays.sort(numbers);
        if (numbers.length > 0) {
            System.out.println("Max = " + numbers[numbers.length - 2]);
            System.out.println("Min = " + numbers[1]);
        } else {
            System.out.println("Array is empty!");
        }
    }


                    //TASK-4
    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n < min) min = n;
        }

        return min;
    }

    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n > secondMax && n < findMax(numbers)) {
                secondMax = n;
            }

            if (n < secondMin && n > findMin(numbers)) {
                secondMin = n;
            }
        }

        System.out.println("second max = " + secondMax);
        System.out.println("second min = " + secondMin);
    }

                    //TASK-5

    public static void findDuplicatedElementsInAnArray(String[] words) {

        String duplicate = "";
        int j;


        for (int i = 0; i < words.length - 1; i++) {
            for (j = i + 1; j < words.length; j++) {
                if ((words[i].equals(words[j])) && (i != j)) {
                    duplicate = words[j];
                }
            }
        }
        System.out.println(duplicate);
    }

                     //TASK-6

    public static void findMostRepeatedElementInAnArray(String[] str) {

        String mostRepeated = "";
        int j;


        for (int i = 0; i < str.length - 1; i++) {
            for (j = i + 1; j < str.length; j++) {
                if ((str[i].equals(str[j])) && (i != j)) {
                    mostRepeated = str[j];
                }
            }
        }
        System.out.println(mostRepeated);
    }


}












