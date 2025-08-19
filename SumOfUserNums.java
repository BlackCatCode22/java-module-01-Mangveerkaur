   // SumOfUserNums.java
   // dh 8/19/25

   // References:
   // This is what I used to learn user input
   // https://www.w3schools.com/java/

   // I need to import the Scanner class from the
   // Java.util.Package this is how I do it

   import java.util.Scanner;

   public class SumOfUserNums {
       public static void main(String[] args) {
           System.out.println("\n\n Welcome to my Sum of user");
           // Get 3 ints from the user and output the sum of ints

           // create the variables needed
           int num1 = 0;
           System.out.println("\n The value of num1 is " + num1 + "\n");

           int num2 = 0;
           int num3 = 0;
           int sumOfUseInts =0;

           // get user input
           // Create a Scanner object named scanner
           Scanner scanner = new Scanner(System.in);
           // Get the first int.
           System.out.println("\n Enter an integer for num1 ");
           num1 = scanner.nextInt();

           // Get the second int.
           System.out.println("\n Enter an integer for num2 ");
           num2 = scanner.nextInt();

           // Get the third int.
           System.out.println("\n Enter an integer for num3 ");
           num3 = scanner.nextInt();

           // Test it
           System.out.println("\n num1 is: "+ num1);
           System.out.println("\n num2 is: "+ num2);
           System.out.println("\n num3 is: "+ num3);
           // add them up!
           int sumOfUserInts = num1 + num2 + num3;

           // Test it!
           System.out.println("\n The sum of the ints is: " + sumOfUserInts);

           System.out.println("\n This is the end of my program");










       }
   }
