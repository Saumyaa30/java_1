/*QUESTION NO. 8*/
import java.util.Scanner;
class Students
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("No. of classes held: ");
 int x = sc.nextInt();
 System.out.println("No. of classes attended: ");
 int y = sc.nextInt();
 float z;
 z=((y*100)/x);
 System.out.println(z);
 if(z>=75)
 System.out.println("Eligible: "+ z);
 else 
 System.out.println(" Not Eligible: "+ z);
}
}