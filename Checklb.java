/*assignment
QUESTION NO. 1*/
import java.util.Scanner;
class Checklb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double L = sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double B = sc.nextDouble();
        if (L==B)
        System.out.println("Yes it's a Square");
        else
        System.out.println("No it's not a Square");
    
    }
}