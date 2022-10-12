package strings;

public class StringConcatenation {
    public static void main(String[] args) {


        /* String city;  // Declaration

        city = ""; // empty String

        city = "Brugge"; //Re-assignment

        System.out.println(city);   */

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;

        System.out.println(s3); // prints HelloWorld

        /*
TASK
Create 2 strings to store your firstName and lastName
Then concatenate them with a third String called as fullName
Then print the full name
 */


        String firstName = "Ibrahim";
        String lName = "Erdem";
        String fullName = firstName + " " + lName;

        System.out.println(fullName);


        String fullname2 = firstName.concat(lName);      // concat w concat method without space

        String fullname3 = firstName.concat(" ").concat(lName); // concat w concat method with space







    }
}
