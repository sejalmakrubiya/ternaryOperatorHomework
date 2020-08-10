import java.util.Scanner;

public class Inharitancehomework {



    public  String generateTheResult(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter marks for Mathes : ");
        int maths= scanner.nextInt();
        System.out.println("Enter marks for Science : ");
        int science=scanner.nextInt();
        System.out.println("Enter marks for English : ");
        int english = scanner.nextInt();

        String result = (maths>=40 && science>40 && english>=40)?"pass":"Fail";
        return result;


    }

}
