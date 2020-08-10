import java.util.Scanner;

public class TernaryOperator1 {
       Scanner scanner = new Scanner(System.in);

    /*1.create a  function that takes in a words and determines whether or not it is plural
    a plural word is one that ends in "s"
     */
    //return type with parameter
    public static boolean pluralMethod (String str1) {
        //entering the string for to find out if it is plural
        boolean result1 = (str1.endsWith("s")) ?
                true : false;
                 return result1;
        }
   public static boolean comparison (){
    /*2. Create a function that takes two strings as arguments and return
         either true or false depending on whether the total number of characters in the
         first string is equal to the total number of characters in the second string*/
       //total number of characters of given two words are equal =true,if not false.

         //comparing two string if it is equal or not
           Scanner scanner = new Scanner(System.in);
           System.out.print("2. Enter the first string to test if total number of characters in both strings  are same or not= ") ;
       {
           String str1 = scanner.next();
           System.out.print("2. Enter the second string to test if total number of characters in both" + "Strings  are same or not =");
           String str2 = scanner.next();
           //comparing the two string using ternary operator
           boolean result2 = (str1.length() == str2.length()) ? true : false;
           return result2;
       }


         }






        /*6.per  6 coffee cups i buy, a 7 th cup free. in total, i get 7 cups.create a
        function that takes n cups bought and return as an integer the total number of
        cups i would get.*/
        //buy 6 coffee cups and get additional 1 for free

       // public Static int  totalCupMethod () {
           // Scanner scanner = new Scanner(System.in);
           // System.out.println("(6) Enter number of cups  = ");
            Integer cups = scanner. nextInt ();
            Integer result6 = (cups / 6 ) + cups;
            //return result6;
        //}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  TotalCupClass totalCupClass = new TotalCupClass();
       // System.out.println("Total number of cups = " + totalCupMethod());


    }
         /*7.write a function that validates whether two strings are identical.
         make it case insensitive.*/
          public String match ()  {
              System.out.println("(7) Enter a first word =");
              String firstword = scanner.next();
              System.out.println("    Enter a second word=");
              String secondword =scanner.next();
              String result7 = (firstword.equalsIgnoreCase(secondword)) ? "true" :  "false";
              return  (" \tif both words are identical,its true,otherwise fales =" + result7);   }

           /*8.given two integers, a and b, return true if can be divided evenly by b.
               return false otherwise.*/
           public String dividesEvenly (){
               System.out.println("(8) Enter the first number=");
               int number1 = scanner.nextInt () ;
               System.out.println("    Enter the second number=");
               int number2 = scanner.nextInt ();
               String result8 = (number1 % number2 == 0) ? "true" : "false";
               return (" \tif first number divided evenly by second number is true, otherwise fales ="+ result8);   }

            /*9.create a method that takes a positive integer and returns the nth "star number"
            a star number is a centered figurate number a centered hexagram (six pointed star ),
            such as the one that chinese checkers is played on */
            public String starNumber ()  {
                System.out.println("(9) Enter the number    =");
                int number = scanner.nextInt () ;
                int result9 = (number* 6 * (number -1)) +1;
                return (" \t star number is =" + result9);    }

             /*10.create a method that takes a string and returns the word count.
             the string will be a sentence.*/
             public String countWords ()  {
                 System.out.print("(10) write a sentence =");
                 String countWords = scanner.next ();
                 String result10 = countWords.contains (" ") ? "0" : "(++1)";
                 return ("\tAnswer is = "+ result10); }


    //public static void main(String[] args) {

             // Scanner scanner = new Scanner(System.in);
       // System.out.print("1.Enter the to test if it is plural or not = ");
       // System.out.print("plural String result is = " + pluralMethod(scanner.nextLine()));
       // System.out.println("Comparing both string = " + comparison());


    }




                // }














































































