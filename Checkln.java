/*QUESTION NO. 2*/
import java.util.Scanner;

public class Checkln
 {
   public static void main (String[] args)
   {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        int num2;
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        if (num1 == num2)
        System.out.println ("both are equal");
        else if (num1 > num2)
        System.out.println (num1 + " is greater");
        else
        System.out.println (num2 + " is greater");

   }
 }