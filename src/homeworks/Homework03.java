package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner (System.in);

       System.out.println("\n---------------TASK 1 ---------------------");
               /*
               -Write a Java program that asks user to enter 2 numbers - int values and
               find the absolute difference between the two numbers by using Math.abs() method
                */
       System.out.println("Please enter 2 numbers");
       int number1 = inputReader.nextInt() , number2 = inputReader.nextInt();

       System.out.println("The difference between is = " + Math.abs(number1-number2));


       System.out.println("\n---------------TASK 2 ---------------------");
       /*
       Write a Java program that asks user to enter 5 numbers - int values and find the Max
       and Min number by using Math.max() and Math.min() methods
        */
       System.out.println("Please enter 5 numbers.");
       int no1 = inputReader.nextInt() , no2 = inputReader.nextInt() , no3 = inputReader.nextInt(),
           no4 = inputReader.nextInt() , no5 = inputReader.nextInt();

       System.out.println("Max value = " + Math.max(no5, Math.max(no4, Math.max(no3,Math.max(no1,no2)))));
       System.out.println("Min value = " + Math.min(no5, Math.min(no4, Math.min(no3,Math.min(no1,no2)))));

        System.out.println("\n---------------TASK 3 ---------------------");
            /*
            Write a Java program that generates 3 random numbers between 50 and 100 both included.
            Use Math.random()
             */
        int random1 = (int)(Math.random() * 51) + 50, random2 = (int)(Math.random() * 51) + 50,
            random3 = (int)(Math.random() * 51) + 50;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n---------------TASK 4 ---------------------");

        /*
            Assume Alex has $125, and Mike has $220 and Alex is going to give $25.5 to Mike.
            Then, How much money will Alex and Mike will have after that?
         */
        double alexHas = 125, mikeHas = 220, alexGiving = 25.5;
               alexHas -= alexGiving;
               mikeHas += alexGiving;

        System.out.println("Alex's money: $" + alexHas);
        System.out.println("Mike's money: " + mikeHas);


       System.out.println("\n---------------TASK 5 ---------------------");

       /*
           Assume David is going to save $390 to buy a bicycle. David can save only $15.60 per day.
           Requirement: Write a program to find how many days later, David can save $390 and buy the
           bicycle.
                   */
        double davidsTarget = 390 , davidCanSave = 15.6;
        System.out.println((int) (davidsTarget / davidCanSave));

 //      double saving = 15.60 , targetBike = 390;
 //      int neededDays = (int) (targetBike / saving);
 //      System.out.println(neededDays);

       System.out.println("\n---------------TASK 6 ---------------------");

       /*
       Convert given Strings below to int data types and find their sum, product, division,
       subtraction and remainder. String s1 = “5”, s2 = “10”;
        */

       String s1 = "5", s2 = "10";
       int value1 = Integer.parseInt(s1), value2 = Integer.parseInt(s2);

       System.out.println("-Sum of " + value1 + " and " + value2 + " is = " + (value1 + value2));
       System.out.println("-Product of " + value1 + " and " + value2 + " is = " + (value1 * value2));
       System.out.println("-Division of " + value1 + " and " + value2 + " is = " + (value1 / value2));
       System.out.println("-Subtraction of " + value1 + " and " + value2 + " is = " + (value1 - value2));
       System.out.println("-Remainder of " + value1 + " and " + value2 + " is = " + (value1 % value2));

        System.out.println("\n---------------TASK 7 ---------------------");
        /*
        Convert given Strings below to int data types and find the greatest and smallest values
        and find the average and absolute difference of them. String s1 = “200”, s2 = “-50”;
         */

        String ss1 = "200", ss2 = "-50";
        int newValue1 = Integer.parseInt(ss1);
        int newValue2 = Integer.parseInt(ss2);
        System.out.println("The greatest value is = " + Math.max(newValue1 , newValue2));
        System.out.println("The smallest value is = " + Math.min(newValue1 , newValue2));
        System.out.println("The average is = " + (newValue1 + newValue2) / 2);
        System.out.println("The absolute difference is = " + Math.abs(newValue1 - newValue2));



        System.out.println("\n---------------TASK 8 ---------------------");

        /* Assume that you have a coin bank, and you save 3 quarters, 1 dime, 2 nickels and 1 penny each day.
        NOTE: Scanner is not needed for this task! -find how many days later you can save $24
        -find how many days later you can save $168 -how much you will save after 5 months (assume a month is 30 days)
        */
        double dailySaving = (.25 *3) + (.1 * 1) + (.05 * 2) + (.01 * 1); // 96 Cents
        int daysNeededFor24 = (int) (24 / dailySaving);
        int daysNeededFor168 = (int) (168 / dailySaving);
        double savingFor150days = 150 * dailySaving;

        System.out.println(daysNeededFor24 + "days");
        System.out.println(daysNeededFor168 + "days");
        System.out.println("$" + savingFor150days);


        System.out.println("\n---------------TASK 9 ---------------------");

        /*
        Jessie is going to save $1,250 to buy a new computer. Jessie is saving $62.5 in a day.
        Write a Java program that calculates how many days it will take for Jessie to but the computer.
        */

       double compPrice = 1250, jesSaves = 62.5;

       int daysToComp = (int) (compPrice/jesSaves);

       System.out.println(daysToComp);

        System.out.println("\n---------------TASK 10 ---------------------");
        /*
        Dan is going to save $14,265 to buy a new car. Dan is given two option to make monthly payments
        with no interest rate. Option 1: Equal payments of $475.50 per month. Option 2: Equal payments
        of $951 per month. Write a Java program that calculates how many months it will take for Dan to
        complete all the payments with option 1 and option 2.
         */

       double carPrice = 14265 , option1 = 475.5 , option2 = 951;

       int monthsToCar = (int) (carPrice / option1);
       int monthsToCar2 = (int) (carPrice / option2);

       System.out.println("Option 1 will take " + monthsToCar + " months");
       System.out.println("Option 2 will take " + monthsToCar2 + " months");


        System.out.println("\n---------------TASK 11 ---------------------");

        /*
         Write a Java program that asks user to enter 2 numbers(number1 and number2) and store those
         in int variables. Find the result of number1/number2 and store this in a double.
         Finally print the result.
         */

        System.out.println("Please enter 2 numbers");
        int numberr1 = inputReader.nextInt();
        int numberr2 = inputReader.nextInt();
        double divisionResult = (double) (numberr1 / numberr2);
        System.out.println(divisionResult);

        System.out.println("\n---------------TASK 12 ---------------------");
        /*
        Write a Java program that generates 3 random numbers between 0 and 100 (0 and 100 are included)
        and find if all numbers are more than 25
         */

       double ranndom1 = (Math.random() * 101);
       double ranndom2 = (Math.random() * 101);
       double ranndom3 = (Math.random() * 101);

       int randInt = (int) ranndom1;
       int randInt2 = (int) ranndom2;
       int randInt3 = (int) ranndom3;

       System.out.println(randInt);
       System.out.println(randInt2);
       System.out.println(randInt3);


       if(randInt > 25 && randInt2 > 25 && randInt3 > 25) {
           System.out.println("true");
       }
           else{
           System.out.println("false");
       }
        // ikinci method bu daha dogru ve kolay bir yontem
        boolean allNumbersOver25 = (randInt > 25 && randInt2 > 25 && randInt3 > 25);
        System.out.println(allNumbersOver25);

        String result = randInt > 25 && randInt2 > 25 && randInt3 > 25 ? "Over 25" : "Less than 25";
        System.out.println(result); // ternary ile yaptim

        //3. yontem direk boolean dondurur.
        System.out.println(randInt > 25 && randInt2 > 25 && randInt3 > 25);


       System.out.println("\n---------------TASK 13 ---------------------");

        /*
        Write a Java program to ask user to enter a number between 1 and 7 (1 and 7 are included)
        Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY
          */

        System.out.println("Please enter a number between 1 and 7");
        int selection = inputReader.nextInt();

        if(selection == 1){
            System.out.println("The number entered returns MONDAY");
             }
        else if (selection == 2) {
            System.out.println("The number entered returns TUESDAY");
            }
        else if (selection == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        }
        else if (selection == 4) {
            System.out.println("The number entered returns THURSDAY");
        }
        else if (selection == 5) {
            System.out.println("The number entered returns FRIDAY");
        }
        else if (selection == 6) {
            System.out.println("The number entered returns SATURDAY");
        }
        else{
            System.out.println("The number entered returns SUNDAY");
        }

       System.out.println("\n---------------TASK 14 ---------------------");
           /*
           Jennifer is taking a math course . This math course requires students to take 3 exams.
           At the end, if the average of those exams is more than or equal to 70, then Jennifer will
           pass the course. However, if the average of those 3 exams is less than 70, then Jennifer
           will fail.
            */
       System.out.println("Tell me your 3 exam results?");
       int firstGrade = inputReader.nextInt(), secondGrade = inputReader.nextInt(),
           thirdGrade = inputReader.nextInt();

       int average = (firstGrade + secondGrade + thirdGrade) / 3;

       if (average < 70)
       System.out.println("YOU FAILED!");
       else{
       System.out.println("YOU PASSED!");
       }

        System.out.println("\n---------------TASK 15 ---------------------");

        /*
        Write a Java program that asks user to enter 3 numbers.
        -If all numbers are different, then print “NO MATCH”
        -If any of those 2 numbers are equal, then print “DOUBLE MATCH”
        -If all 3 numbers are equal, then print “TRIPLE MATCH”
         */

         System.out.println("Please enter 3 numbers");

         int numb1 = inputReader.nextInt(), numb2 = inputReader.nextInt(), numb3 = inputReader.nextInt();

         if(numb1 != numb2 && numb2 != numb3){
             System.out.println("NO MATCH");
         }
         else if (numb1 == numb2 && numb2 == numb3) {
             System.out.println("TRIPLE MATCH");
         }
         else{
             System.out.println("DOUBLE MATCH");
         }




     }
}
