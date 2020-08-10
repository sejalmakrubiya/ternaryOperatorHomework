import java.util.Scanner;

public class AnimalClass5 {

    /*5. In this challenge, a farmer is asking you tell him how  many legs
      can be counted among all his animals.the farmer breeds three species:*/
    // return type with parameter
    public static int numberOfLegsMethod(int chicken) {
        // to find out how many legs can be counted among all the animals

        int cows = 4; int pigs =4;
        Integer results5 = (chicken * 2 +  cows * 4 +  pigs * 4) ;
            return results5;


    }

        public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);


         System.out.println("(5)   Enter total number of chicken  in the farm =");
        // Integer chicken = scanner.nextInt();
         System.out.println(" (5)   Enter total number of cows  in the farm     ");
        // Integer cows = scanner.nextInt();
         System.out.println("  (5)  Enter total number of pigs   in the farm    ");
        // Integer pigs = scanner.nextInt();
         System.out.println("Total number of the legs of animals =" + numberOfLegsMethod(scanner.nextInt()));

     }
}




















































































































































