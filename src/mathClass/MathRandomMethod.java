package mathClass;

import java.util.Random;

public class MathRandomMethod {
    public static void main(String[] args) {


 //     double myRandom = Math.random();
 //     int myRandomBetween0to10 = (int)Math.random() * 11; // 11 yaptik cunku 0 ve 10 u da alabilmek icin)
 //     int myRandomCastingBetween0to10 = (int) Math.random() * 11; // 11 yaptik cunku 0 ve 10 u da alabilmek icin)
 //     int myDice = (int) (Math.random() * 6) +1;

 //     System.out.println(myDice);


 //     // Returns a double between 0 -  0.999
 //   //  System.out.println("Random number is = " + Math.random());

 //     System.out.println("Random number is = " + myRandom);
 //     System.out.println("myRandomBetween0to10 = " + myRandomBetween0to10);
 //     System.out.println("myRandomCastingBetween0to10 = " + myRandomCastingBetween0to10);


 //     int myRandNo = (int) (Math.random() * (40 -20 + 1) + 20);
 //      System.out.println(" Your Random number is " + myRandNo);

 //      int rastgele = (int)Math.random() * (10 -5 + 2)  + 5;
 //      System.out.println(rastgele);


 //      System.out.println (Math.random());
 //      System.out.println (Math.random() * 10);

 //      double randomBetw0to10 = (int) (Math.random() * 10); // Atama yani assignment yaptiginda hep parantez kullan
 //      System.out.println(randomBetw0to10);

        // O'dan 10 a kadar olan sayilari basmak icin
        // double randomBetw0to10 = (int) (Math.random() * 11); 11 ile carpiyoruz. Cunku Math Class'i sayi
        //random sayi secerken 0 ve 0.9999 arasinda seciyor 10 ile carparsak max 9.999 edeceginden
        // 11 ile carpiyoruz.


                // Zar ornegi icin ise; Sonucta 0 olmamali, 1 den 6'ya kadar olmali.

       // int zarOrnegi = (int) ((Math.random() * 6) +1);
        // System.out.println(zarOrnegi);

      //  int randomBetween50And100 = (int) (Math.random() * 51) + 50;  // 50 ve 100 arasi rasgele icin
      //  System.out.println(randomBetween50And100);

        // formula
        //  int ornekIkiSayiArasRandom = (int) (Math.random() * (big point - small point + 1) + small point)
          int randomBetween80And150 =  (int) (Math.random() *             ( 71) +                  80);

          System.out.println(randomBetween80And150);


    }
}
