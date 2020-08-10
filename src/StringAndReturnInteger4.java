import java.util.Scanner;

public class StringAndReturnInteger4 {
    public String  stringIntMethod() {

        //4.create a function that takes a string and returns it is an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number + ");
        String str1 = scanner.nextLine();
        int j = Integer.valueOf(str1);

        String result4 = ("String to int using valueOf() = " + j );
        return  result4;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

}
