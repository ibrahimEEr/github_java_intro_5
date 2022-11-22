package homework;

import com.sun.deploy.net.MessageHeader;
import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("----------Task-1----------\n");

        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == (numbers[j])) {
                    System.out.println(numbers[i]);
                    return;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != (numbers[j])) {
                    System.out.println("There is no duplicates");
                    return;
                }
            }
        }



        System.out.println("\n----------Task-2----------\n");

        String[] words = {"Z", "abc", "z", "123", "#"};


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    return;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!words[i].equalsIgnoreCase(words[j])) {
                    System.out.println("There is no duplicates");
                    return;
                }
            }
        }


        System.out.println("\n----------Task-3----------\n");


        int[] task3nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        ArrayList<Integer> task3 = new ArrayList<>();
        for (int i = 0; i < task3nums.length - 1; i++) {
            for (int j = i + 1; j < task3nums.length; j++) {
                if (task3nums[i] == task3nums[j] && !task3.contains(task3nums[i])) {
                    task3.add(task3nums[i]);

                }
            }
        }
        if (task3.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer n : task3) System.out.println(n);

        System.out.println("\n----------Task-4----------\n");

        String[] wordsTask4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};

        ArrayList<String> task4 = new ArrayList<>();


        for (int i = 0; i < wordsTask4.length; i++){
            for(int j = i + 1; j < wordsTask4.length; j++){

                if (wordsTask4[i].equalsIgnoreCase(wordsTask4[j]) && !task4.contains(wordsTask4[i])){
                    task4.add(wordsTask4[i]);

                }
            }
        }
        if (task4.isEmpty()) {
            System.out.println("There is no duplicates");
        }else
            task4.forEach(System.out::println);



        System.out.println("\n----------Task-5----------\n");

        String[] task5Words = {"abc", "foo", "bar"};
        StringBuilder reversed = new StringBuilder();

        for (int i = task5Words.length; i > 0; i--) {
            reversed.append(task5Words[i - 1]).append(" ");
        }

        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));


        System.out.println("\n----------Task-6----------\n");

        String task6 = "Java is fun";
        StringBuilder sbForTask6 = new StringBuilder(task6);
        System.out.println(sbForTask6.reverse());


    }
}