package homework;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("--------TASK 1--------\n");

        int[] arr = new int[10];

        arr[2] = 23;
        arr[4] = 12;
        arr[7] = 34;
        arr[9] = 7;
        arr[6] = 15;
        arr[0] = 89;

        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[9]);
        System.out.println(Arrays.toString(arr));

        System.out.println("\n--------TASK 2--------\n");

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\n--------TASK 3--------\n");

        int[] numbers = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n--------TASK 4--------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n--------TASK 5--------\n");

        String[] dogNames = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogNames));
        if (Arrays.toString(dogNames).contains("Pluto")) System.out.println("true");

        System.out.println("\n--------TASK 6--------\n");

        String[] catNames = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(catNames);
        System.out.println(Arrays.toString(catNames));

        if(Arrays.toString(catNames).contains("Felix") && Arrays.toString(catNames).contains("Garfield"))
            System.out.println("true");
        else System.out.println("false");

        System.out.println("\n--------TASK 7--------\n");

        double[] dNumbers = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(dNumbers));

        for (double dNumber : dNumbers) {
            System.out.println(dNumber);
        }


        System.out.println("\n--------TASK 8--------\n");

        char[] cArray = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(cArray));
        int lCounter = 0;
        int lowCounter = 0;
        int upCounter = 0;
        int dCounter = 0;
        int specCounter = 0;

        for (char element : cArray) {
            if(Character.isLetter(element)) lCounter++;
            if(Character.isUpperCase(element)) upCounter++;
            if(Character.isLowerCase(element)) lowCounter++;
            if(Character.isDigit(element)) dCounter++;
            if((element > 31 && element < 48) || element > 57 && element < 65) specCounter++;
        }
        System.out.println("Letters = " + lCounter);
        System.out.println("Uppercase letters = " + upCounter);
        System.out.println("Lowercase letters = " + lowCounter);
        System.out.println("Digits = " + dCounter);
        System.out.println("Special characters = " + specCounter);


        System.out.println("\n--------TASK 9--------\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;


        for (String object : objects) {

            if(Character.isUpperCase(object.charAt(0))) counter1++;
            if(Character.isLowerCase(object.charAt(0))) counter2++;
            if(object.startsWith("B") || object.startsWith("P")) counter3++;
            if(object.toLowerCase().equals("book") || object.toLowerCase().equals("pen")) counter4++;
        }

        System.out.println("Elements starts with uppercase = " + counter1);
        System.out.println("Elements starts with lowercase = " + counter2);
        System.out.println("Elements starting with B or P = " + counter3);
        System.out.println("Elements having \"book\" or \"pen\" = " + counter4);

        System.out.println("\n--------TASK 10--------\n");

        int[] task10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(task10));

        int tenPlus = 0;
        int tenLower = 0;
        int tenExact = 0;

        for (int num : task10) {
         if(num > 10) tenPlus++;
         if(num < 10) tenLower++;
         if(num == 10) tenExact++;
        }

        System.out.println("Elements that are more than 10 = " +  tenPlus);
        System.out.println("Elements that are less than 10 = " +  tenLower);
        System.out.println("Elements that are 10 = " +  tenExact);


        System.out.println("\n--------TASK 11--------\n");

        int[] firstArray = {5, 8, 13, 1, 2};
        int[] secondArray = {9, 3, 67, 1, 0};
        int[] thirdArray = new int[5];

        for (int i = 0; i <firstArray.length; i++) {
            if(firstArray[i] > secondArray[i]) thirdArray[i] = firstArray[i];
            else thirdArray[i] = secondArray[i];
        }

        System.out.println("1st array is = " + Arrays.toString(firstArray));
        System.out.println("2nd array is = " + Arrays.toString(secondArray));
        System.out.println("3rd array is = " + Arrays.toString(thirdArray));


    }
}
