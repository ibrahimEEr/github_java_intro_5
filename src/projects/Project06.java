package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {

    public static void main(String[] args) {
        System.out.println("------------Task1--------------\n");
        String[] stringArray1 = {"", "", "", "", ""};
        System.out.println(task1(stringArray1));

        System.out.println("\n------------Task2--------------\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(task2(numbers));

        System.out.println("\n------------Task3--------------\n");
        System.out.println(validatePassword("abcd1234!"));

        System.out.println("\n------------Task4--------------\n");
        String emailToTest = "abcd@gmail.com";
        System.out.println(validateEmailAddress(emailToTest));


    }
            //Method for Task1
        static int counter = 0;
        public static int task1 (String[] args){

            for (String n : args) {
                if (n.contains(" ") &&  n != null && n.length() > 0) counter++;
            }
            return counter;
        }


            //Method for task2
        public static ArrayList task2(ArrayList<Integer> numbers){
            for (Integer number : numbers) {
               numbers.removeIf(x-> x < 0); return numbers;
            }
            return numbers;
        }



        //Method for task3
    public static boolean validatePassword(String password){

       String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
       Pattern pattern = Pattern.compile(passPattern);
       Matcher matcher = pattern.matcher(password);
       return matcher.matches();
    }



        //Method for task4
    public static boolean validateEmailAddress(String email){
        String emailValidator = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailValidator);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}