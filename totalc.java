/*QUESTION NO. 3*/
import java.util.Scanner;
class totalc
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    double n = sc.nextDouble();
    if(n>1000) 
    {
       System.out.println("The total cost = "+(n-(n/100*10)));
    }
    else
    {
       System.out.println("The total cost = "+n);
    }
    }
}