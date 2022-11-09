package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n--------- Task 1 ------------\n");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n--------- Task 2 ------------\n");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n--------- Task 3 ------------\n");

        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);

        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);


        System.out.println("\n--------- Task 4 ------------\n");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n--------- Task 5 ------------\n");

        ArrayList<String> marvelChars = new ArrayList<>();

        marvelChars.add("Spider Man");
        marvelChars.add("Iron man");
        marvelChars.add("Black Panther");
        marvelChars.add("Deadpool");
        marvelChars.add("Captain America");

        System.out.println(marvelChars);
        System.out.println(marvelChars.contains("Wolverine"));


        System.out.println("\n--------- Task 6 ------------\n");

        ArrayList<String> avengers = new ArrayList<>();

        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\n--------- Task 7 ------------\n");

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (Character i : chars) {
            System.out.println(i);
        }


        System.out.println("\n--------- Task 8 ------------\n");

        ArrayList<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int mMcounter = 0;
        int aEcounter = 0;

        for (String object : objects) {
            if(object.startsWith("M") || object.startsWith("m")) mMcounter++;
            if(!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) aEcounter++;
            }

        System.out.println(mMcounter);
        System.out.println(aEcounter);

        System.out.println("\n--------- Task 9 ------------\n");

        ArrayList<String> utensils = new ArrayList<>();

        utensils.add("Plate");
        utensils.add("spoon");
        utensils.add("fork");
        utensils.add("Knife");
        utensils.add("cup");
        utensils.add("Mixer");

        System.out.println(utensils);

        int upperCount = 0;
        int lowerCount = 0;
        int hasPcount = 0;
        int startsEndsPCount = 0;

        for (String i : utensils) {
            if(Character.isUpperCase(i.charAt(0))) upperCount++;
            if(Character.isLowerCase(i.charAt(0))) lowerCount++;
            if(i.contains("P") || i.contains("p")) hasPcount++;
            if(i.toLowerCase().startsWith("p") || i.toLowerCase().endsWith("p")) startsEndsPCount++;
        }

        System.out.println("Elements starts with uppercase = " + upperCount);
        System.out.println("Elements starts with lowercase = " + lowerCount);
        System.out.println("Elements having P or p = " +hasPcount);
        System.out.println("Elements starting or ending with P or p = " +startsEndsPCount);


        System.out.println("\n--------- Task 10 ------------\n");

        ArrayList<Integer> numbers10 = new ArrayList<>();

        numbers10.add(3);
        numbers10.add(5);
        numbers10.add(7);
        numbers10.add(10);
        numbers10.add(0);
        numbers10.add(20);
        numbers10.add(17);
        numbers10.add(10);
        numbers10.add(23);
        numbers10.add(56);
        numbers10.add(78);

        int counter10 = 0;
        int over15Counter = 0;
        int less20Counter = 0;
        int less15Over50 = 0;

        for (Integer number : numbers10) {
            if(number % 10 == 0)  counter10++;
            if(number % 2 == 0 && number > 15) over15Counter++;
            if(number % 2 == 1 && number < 20) less20Counter++;
            if(number < 15 || number > 50) less15Over50++;
        }


        System.out.println(numbers10);
        System.out.println("Elements that can be divided by 10 = " + counter10);
        System.out.println("Elements that are even and greater than 15 = " + over15Counter);
        System.out.println("Elements that are odd and less than 20 = " + less20Counter);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Over50);



    }
}
