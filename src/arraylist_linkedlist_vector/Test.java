package arraylist_linkedlist_vector;

import java.time.Period;
import java.util.*;

public class Test {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
//
//        System.out.println(numbers.stream().filter(x -> x % 10 == 0).count());

//        for (Integer number : numbers) {
//
//        }


//        int counter10 = 0;
//        int over15Counter = 0;
//        int less20Counter = 0;
//        int less15Over50 = 0;

//        for (Integer number : numbers) {
//            if(number % 10 == 0)  counter10++;
//            if(number % 2 == 0 && number > 15) over15Counter++;
//            if(number % 2 == 1 && number < 20) less20Counter++;
//            if(number < 15 || number > 50) less15Over50++;
//        }


//        System.out.println(numbers);
//        System.out.println("Elements that can be divided by 10 = " + counter10);
//        System.out.println("Elements that are even and greater than 15 = " + over15Counter);
//        System.out.println("Elements that are odd and less than 20 = " + less20Counter);
//        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Over50);


//        ArrayList<String> familyNames = new ArrayList<>(Arrays.asList("Ahmet", "Zeliha", "Bora", "Ibo", "ayse", "Akin"));
//
//        System.out.println("Number of names beginning with \"A\" or \"a\" = " + familyNames.stream().filter(x -> x.startsWith("A") || x.startsWith("a")).count());
//        System.out.println("Number of names beginning with \"A\" or \"a\" = " + familyNames.stream().filter(x -> x.charAt(0) == 'A' || x.charAt(0) == 'a').count());


//        int aCounter = 0;
//        int aCounterWithCharAt = 0;
//        for(String name : familyNames){
//            if(name.startsWith("A") || name.startsWith("a")) aCounter++;
//            if(name.charAt(0) == 'A' || name.charAt(0) == 'a') aCounterWithCharAt++;
//
//        }
//
//        System.out.println("Number of names beginning with \"A\" or \"a\" = " + aCounter);
//        System.out.println("Number of names beginning with \"A\" or \"a\" = " + aCounterWithCharAt);


//        for(String name : familyNames){
//            if(!name.equals("Ibo") && !name.contains("r")) System.out.println(name);
//       }

//        System.out.println(familyNames.stream().filter(x -> x.equals("Ibo")).count());

//
//        ArrayList<String> kitchenUtens = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
//
//        for(String name : kitchenUtens){
//            if(Character.isUpperCase(name.charAt(0))) System.out.println();
//
//        }





        //System.out.println(kitchenUtens);

//        int capitalCounter = 0;
//
//        for(String name : kitchenUtens){
//           if(Character.(name.charAt(1))) capitalCounter++;
//        }
//        System.out.println(capitalCounter);


//        int n, a = 0, b = 1, c;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter a number for fibonnaci");
//        n = input.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if(i<=1) System.out.println(i);
//            c = a+b;
//            System.out.println(c);
//            a = b;
//            b = c;
//           }


        // 0,1,1,2,3,5,8,13,21

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter a number for fibonnaci");
//
//        int n = input.nextInt();
//        int n1 = 0, n2 = 1, n3;
//
//        System.out.print(n1 + " " + n2 + " ");
//
//        for(int i = 2 ; i < n ; i++){
//            n3 = n1 + n2;
//           System.out.print(n3 + " ");
//            n1 = n2;
//            n2 = n3;
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to see the fibonacci");
//        int nTimes = scanner.nextInt();
//        int n1 = 0;
//        int n2 = 1;
//        int n3;
//        if(n1 > 1 && n2 > 1) System.out.print(n1 + " " + n2 + " ");
//
//        for (int i = 0; i < nTimes -2 ; i++) {
//           n3 = n1 + n2;
//           if(n3 > 10) System.out.print(n3 + " ");
//           n1 = n2;
//           n2 = n3;
//        }


//        ArrayList<String> deneme = new ArrayList<>(Arrays.asList("kitap", "Kalem", "sozluk", "Papatya"));
//
//        System.out.println(deneme);
//        System.out.println(deneme.get(2).toUpperCase());
//        deneme.add(3, "merhaba");
//        System.out.println(deneme);
//        deneme.add("selam");
//        System.out.println(deneme);
//        deneme.add(0, "hulooogg");
//        System.out.println(deneme);
//        deneme.removeIf(x-> x.startsWith("k"));
//        System.out.println(deneme);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a sentence or word");
//        String s = scanner.nextLine();
//
//        String rev = "";
//
//
//        for (int i = s.length()-1 ; i >= 0; i--){
//
//            rev += s.charAt(i);
//
//        }
//
//        System.out.println(rev);


//        System.out.println("enter a string");
//        StringBuffer kelime = new StringBuffer(scanner.nextLine());
//        System.out.println(kelime.reverse());
            //Baska bir yontem
//        StringBuffer bafibafi =new StringBuffer("Ne idiyon lan");
//        System.out.println(bafibafi.insert(0, "ibo "));


//        System.out.println("adinizi aliyim");
//       int studentCounter = 0;
//       if(scanner.nextLine().length() <= 0)
//           System.out.println("sinif bos");


//        ArrayList<String> langNames = new ArrayList<>(Arrays.asList("Java", "javaScript", "C", "C#", "Python"));

//        langNames.removeIf(x-> x.startsWith("J") || x.startsWith("j"));
//
//        System.out.println(langNames);


//            Vector<Integer> numbers = new Vector<>(Arrays.asList(10,15,20,25,30));
//
//        System.out.println("The number of odds " + numbers.stream().filter(x -> x % 2 == 1).count());
//        System.out.println(numbers.stream().filter(x -> x > 15).count());


//        int nTimes = 8;
//        int n1 = 0, n2 = 1, n3;
//        System.out.print(n1 + " " + n2 + " ");
//
//        for(int i = 2; i < nTimes; i++){
//            n3 = n1 + n2;
//            System.out.print(n3 + " ");
//
//            n1 = n2;
//            n2 = n3;
//
//        }

      // 0 1 1 2 3 5 8 13 21

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "Notebook", "Macbook Pro"));

        objects.removeIf(x-> x.toLowerCase().contains("book"));
        System.out.println(objects);

        Iterator<String> iteratoros = objects.iterator();

        while(iteratoros.hasNext()){

            if(iteratoros.next().toLowerCase().contains("book")) iteratoros.remove();
        }
        System.out.println(objects);





    }
}
