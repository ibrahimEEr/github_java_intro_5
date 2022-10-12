package casting;

public class CastingKendiCalismam {
    public static void main(String[] args) {

        //Exercise 7
/*
        TASK
        Find the absolute difference between s1 and s2
        Find the absolute difference between s3 and s2
        Find the absolute difference between s3 and s1
        Expected output:
        50
        100
        50
         */


        String s1 = "100", s2 = "150", s3 = "50";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        System.out.println(" Absolute difference between s1 and s2 is " + Math.abs(i1 - i2));
        System.out.println(" Absolute difference between s3 and s2 is " + Math.abs(i3 - i2));
        System.out.println(" Absolute difference between s3 and s1 is " + Math.abs(i3 - i1));




        //      String salary1 = "5000";
 //      String salary2 = "6000.25";
 //      String salary3 = "4000.50";

 //      /*
 //      TASK 1
 //      Find min and max salary
 //      Expected output:
 //      Min salary = $4000.5
 //      Max salary = $6000.25

 //       */
 //              //Burada String'i double'a cevirdik.
 //      double income1 = Double.parseDouble(salary1);
 //      double income2 = Double.parseDouble(salary2);
 //      double income3 = Double.parseDouble(salary3);

 //      System.out.println("Max salary out of 3 is $ " + Math.max (Math.max(income1, income2) , income3));
 //      System.out.println("Min salary out of 3 is $ " + Math.min (Math.min(income1 , income2) , income3));

 //      System.out.println("10 % of Min salary out of 3 is $ " + (Math.min (Math.min(income1 , income2) , income3))*.10);


    }
}
