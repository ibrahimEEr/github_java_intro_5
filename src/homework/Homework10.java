package homework;

import java.util.ArrayList;
import java.util.Arrays;


public class Homework10 {

    public static void main(String[] args) {

        System.out.println("-------------- TASK 1 ----------");
        System.out.println(countWords("Selenium is the most common UI automation tool"));

        System.out.println("-------------- TASK 2 ----------");
        System.out.println(countA("QA stands for Quality Assurance"));

        System.out.println("-------------- TASK 3 ----------");
        ArrayList<Integer> numbersForTask3 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(numbersForTask3));

        System.out.println("-------------- TASK 4 ----------");
        ArrayList<Integer> numbersForTask4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        removeDuplicateNumbers(numbersForTask4);

        System.out.println("-------------- TASK 5 ----------");
        ArrayList<String> strForTask5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        removeDuplicateElements(strForTask5);

        System.out.println("-------------- TASK 6 ----------");
        removeExtraSpaces("   I   am      learning            Java      ");


        System.out.println("-------------- TASK 7 ----------");

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        add(arr1,arr2);


        System.out.println("-------------- TASK 8 ----------");

        int[] task8Numbers = {10, -13, 5, 70, 15, 57};
        findClosestTo10(task8Numbers);



    }
    // -------------- TASK 1 ----------
    public static int countWords(String task1){
        int number = 0;
        for (int i = 0; i < task1.length()-1; i++) {
            if(task1.charAt(i) == ' ') number++;
        }
        return number+1;
    }

      // -------------- TASK 2 ----------

        public static int countA(String task2){
            int count = 0;
            for (int i = 0; i < task2.length()-1; i++) {
                if(task2.toLowerCase().charAt(i) == 'a') count++;
            }
            return count;
        }


      // -------------- TASK 3 ----------

    public static int countPos(ArrayList<Integer> task3){
        int task3Counter = 0;
        for (Integer i : task3) {
            if(i>0) task3Counter++;
        }
     return task3Counter;
    }

    // -------------- TASK 4 ----------
       public static void removeDuplicateNumbers(ArrayList<Integer> task4){

           ArrayList<Integer> uniques = new ArrayList<>();

           for (Integer i : task4) {
               if(!uniques.contains(i)) uniques.add(i);
           }
           System.out.println(uniques);
       }

       // -------------- TASK 5 ----------

        public static void removeDuplicateElements(ArrayList<String> task5){

            ArrayList<String> uniquesTask5 = new ArrayList<>();
            for (String i : task5) {
                if(!uniquesTask5.contains(i)) uniquesTask5.add(i);
            }
            System.out.println(uniquesTask5);
    }


        // -------------- TASK 6 ----------
    public static void removeExtraSpaces(String task6){

        String result = task6.replaceAll("\\s+", " ");
        System.out.println(result);
    }

    // -------------- TASK 7 ----------

        public static void add(int[] arr1, int[] arr2){

          int[] sum = new int[Math.max(arr1.length, arr2.length)];

            for(int i = 0; i < sum.length; i++) {
            sum[i] = (i < arr1.length ? arr1[i] : 0) + (i < arr2.length ? arr2[i] : 0);
            }
            System.out.println(Arrays.toString(sum));
        }

         // -------------- TASK 8 ----------

          public static void findClosestTo10(int[] arr1){

              int myNumber = 10;
              int distance = Math.abs(arr1[0] - myNumber);
              int idx = 0;
              for(int c = 1; c < arr1.length; c++){
                  int cdistance = Math.abs(arr1[c] - myNumber);
                  if(cdistance < distance){
                      idx = c;
                      distance = cdistance;
                  }
              }
              int theNumber = arr1[idx];

              System.out.println(theNumber);
             }


}







