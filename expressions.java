/*QUESTION NO. 10*/
import java.util.Scanner;
class expressions
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int x = 2;
    x = sc.nextInt();
    int y = 5;
    y = sc.nextInt();
    int z = 0;
    z = sc.nextInt();
    System.out.println(x == 2);
    System.out.println(x!= 5);
    System.out.println(x!= 5 && y >= 5);
    System.out.println(z!= 0 || x == 2);
    System.out.println(!(y < 10));
    }
}