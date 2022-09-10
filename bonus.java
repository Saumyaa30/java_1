/*QUESTION NO. 4*/
import java.util.Scanner;
public class bonus
{
  public static void main(String[] args)
{
   double c;
   Scanner sc = new Scanner(System.in);
   double a; 
   double b;
   System.out.println("Input the monthly salary");
   a=sc.nextInt();
   System.out.println("Give your serving years");
   b=sc.nextInt();
   c=(5/100)*a;
   if (b>5||b==5)
    { 
        System.out.println("Here's your bonus:]" +c);
    }
   else
    {
        System.out.println("Your bonus access is canceled");
    }
}

}