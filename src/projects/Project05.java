package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("---------------TASK 1----------------\n");
        int[] numbers = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);


        System.out.println("\n---------------TASK 2 --------------\n");
        int[] numbers1 = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallest(numbers1);

        System.out.println("\n---------------TASK 3 --------------\n");
        int[] numbers3 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers3);

        System.out.println("\n---------------TASK 4 --------------\n");


    }


           public static void findGreatestAndSmallestWithSort(int[] numbers){

                 Arrays.sort(numbers);
               if (numbers.length > 0){
                   System.out.println("Max = " + numbers[numbers.length - 1]);
                   System.out.println("Min = " + numbers[0]);
               }else{
                   System.out.println("Array is empty!");
               }

          }


          public static void findGreatestAndSmallest (int[] numbers){

              int max = Integer.MIN_VALUE;
              int min = Integer.MAX_VALUE;

              for (int number : numbers) {

                  if(number > max){
                      max = number;
                  }

                  if(number < min){
                      min = number;
                  }
              }

              if (numbers.length > 0){
                  System.out.println("Max is = " + max);
                  System.out.println("Min is = " + min);
              }else{
                  System.out.println("Array is empty!");
              }

          }

            public static void findSecondGreatestAndSmallestWithSort(int[] numbers){

            Arrays.sort(numbers);
                if (numbers.length > 0){
                    System.out.println("Max = " + numbers[numbers.length - 2]);
                    System.out.println("Min = " + numbers[1]);
                }else{
                    System.out.println("Array is empty!");
                }
    }

//                public static void findSecondGreatestAndSmallest(int[] numbers){
//
//                int secSmall = Integer.MIN_VALUE;
//                int secGreat = Integer.MAX_VALUE;
//
//                    for (int number : numbers) {
//
//                        if(number > secGreat && )
//                            secGreat = number;
//                    }
//
//
//                          Dogru gidiyor yarin devam _13_ de cevap var. 2.ekleme
//
//                 }




}
