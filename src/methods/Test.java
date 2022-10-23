package methods;

public class Test {
    public static void main(String[] args) {

        valueFinder("MerhabaM");

    }

    public static void valueFinder(String str){

        if (str.length() < 2){
            System.out.println("Length is less than 2");
        }else{
           System.out.println(str.substring(0,2).equals(str.substring(str.length()-2)));
        }

    }


}

