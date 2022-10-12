package homeworks;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Random random = new Random();
//
//        int newRandom = random.nextInt(21) + 10;
//
//        System.out.println(newRandom);
//
//        int result = (newRandom < 20) ? Integer.parseInt("30") : Integer.parseInt("90");
//        System.out.println(result);

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter your exam result with decimals");
//        double exResult =scanner.nextDouble();

        // Ternary method
//        String result = (exResult >= 70) ? "you pass the exam" : "you failed bro";
//        System.out.println(result);

        // if else method

//        if (exResult >= 70 && exResult <= 100){
//            System.out.println("afferin keles");
//        }else if (exResult <= 60 && (exResult > 50)){
//            System.out.println("cok calisman lazim cok");
//        }else if (exResult <= 30){
//            System.out.println("ne yaptin be guzelim");
//        }else{
//            System.out.println("ha masallah");
//        }


//        System.out.println("3 sayi giriniz");
//
//        int i = scanner.nextInt();
//        int x = scanner.nextInt();
//        int z = scanner.nextInt();
//        int max = (Math.max(z, Math.max(i,x)));
//
//        System.out.println("The largest number you entered is " + max);

//        Scanner scannerx = new Scanner(System.in);
//        System.out.println("notunuzu girin");
//        int grade = scannerx.nextInt();

        // String s = grade >= 70 ? "you passed the exam" : "you failed";
//       if (grade >= 70){
//           System.out.println("you passed the exam");
//       }else {
//           System.out.println("you failied");
//       }

//        String examResult = grade >= 70 ? "you passed" : "you failed";
//        System.out.println(examResult);

//        String s1 = "5", s2 = "10";
//        int s1_sayiDegeri = Integer.parseInt(s1);
//        int s2_sayiDegeri = Integer.parseInt(s2);
//
//        int toplam = s1_sayiDegeri + s2_sayiDegeri;
//
//        System.out.println(toplam);


       /*
        Write a Java program that generates 3 random numbers between 0 and 100 (0 and 100 are included)
        and find if all numbers are more than 25
         */


//       Random random = new Random();
//       int newRandom = random.nextInt(101);
//       int newRandom2 = random.nextInt(101);
//       int newRandom3 = random.nextInt(101);
//        System.out.println(newRandom);
//        System.out.println(newRandom2);
//        System.out.println(newRandom3);
//
//       if(newRandom > 25 && newRandom2 > 25 && newRandom3 > 25) {
//           System.out.println("all numbers are bigger than 25");
//       }

//        System.out.println(newRandom > 25 && newRandom2 > 25 && newRandom3 > 25); // daha kolay 3. yontem
        //true veya false verir


        //   String result = random1 > 25 && random2 > 25 && random3 > 25 ? "Over 25" : "Less than 25";
        //  System.out.println(result); // ternary ile yaptim


//                System.out.println("is it raining ? Only answer true or false");
//                boolean answer1 = scanner.nextBoolean();
//
//                System.out.println("Do you have an umbrella? Only answer true or false");
//                boolean answer2 = scanner.nextBoolean();
//
//                System.out.println("Are you hungry? Only answer true or false");
//                boolean answer3 = scanner.nextBoolean();
//
//                if (answer1){
//                    System.out.println("It is raining outside");
//                    if(answer2){
//                        System.out.println("you can go outside");
//                    }else{
//                        System.out.println("You stay at home");
//                    }
//                }else{
//                    System.out.println("No rain at all");
//                    if (answer3){
//                        System.out.println("go to chikochiko");
//                    }else{
//                        System.out.println("you ride a bike if not hungry");
//                     }

        /*
        Write a Java program to ask user to enter a number between 1 and 7 (1 and 7 are included)
        Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY
          */
        //Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a number between 1 and 7. (1 and 7 included)");
//
//        int number = scanner.nextInt();
//
//        switch (number) {
//            case 1:
//                System.out.println("bir pazartesi girdiniz");
//                break;
//            case 2:
//                System.out.println("iki girdiniz sali oluyor");
//                break;
//            case 3:
//                System.out.println("3 carsamba");
//                break;
//            case 4:
//                System.out.println("4 Pers");
//                break;
//            case 5:
//                System.out.println("5 cumbaba");
//                break;
//            case 6:
//                System.out.println("6 cimaertesi");
//                break;
//            case 7:
//                System.out.println("7 Sunday");
//                break;
//            default:
//                System.out.println("hec yediden boyuk ama olur genni???");
//             }


          /*
           Jennifer is taking a math course . This math course requires students to take 3 exams.
           At the end, if the average of those exams is more than or equal to 70, then Jennifer will
           pass the course. However, if the average of those 3 exams is less than 70, then Jennifer
           will fail.
            */


//            System.out.println("PLease enter your exam results");
//            double firstGrade = scanner.nextDouble();
//            double secondGrade = scanner.nextDouble();
//            double thirdGrade = scanner.nextDouble();
//
//            double average = (firstGrade + secondGrade +thirdGrade) / 3 ;
//
//            if (average >= 70 ) {
//                System.out.println("you passed");
//            }else{
//                System.out.println("you failed");
//            }
//
//                // One statement if else, { } yok
//            if (average > 70) System.out.println("you passed");
//            else System.out.println("you failed");
//
//            //Turnery
//            String result = average >= 70 ? "you passed" : "You failed";
//            System.out.println(result);
//
//            // Turnery en kisa
//            System.out.println(average >= 70 ? "you passed" : "You failed");


//        if("AA".equals("AA")) System.out.println("These strings are equal");
//        else System.out.println("These strings are not equal");
//
//
//        if("AA".equals("Ab")) System.out.println("Esitler");
//        else if("AA".equalsIgnoreCase("aa")) System.out.println("Tam esit degiller ama lower upper'i ignore ettiginde esitler");
//        else System.out.println("ikisi de degil");
//        // Sadece ikinci satiri calistiriyor if'e bakiyor dogru degilse, else if'e bakiyor
//        // o da dogru degilse else'e bakiyor. Herhangi biri dogruysa alttakini calistirmiyor.
//        //Yani {}{} koymadan bu sekilde yazilabilir.



    }
}