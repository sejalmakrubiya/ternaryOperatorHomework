import java.util.Scanner;

public class TernaryOperator2 {



    // return type with parameter
//3.create a function that returns true if a string contains any spaces
    public static boolean SpacesMethod(String str1) {
        //entering the  string for find out if space in the string
        boolean result3 = (str1.contains(" ")) ? true : false;
        return result3;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3.Enter the String to test if it has space or not = ");
        System.out.println("String space = " +SpacesMethod(scanner.nextLine()));

    }


}


