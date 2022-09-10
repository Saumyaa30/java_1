/*QUESTION NO. 6*/
import java.util.Scanner;
public class Age
{
     public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First person's age: ");
        int a = sc.nextInt();
        System.out.println("Enter Second person's age: ");
        int b = sc.nextInt();
        System.out.println("Enter Third person's age: ");
        int c = sc.nextInt();
        if(a>b && b>c)
        System.out.println("First person is older & Third person is younger");
        else if(a>b && c>a)
        System.out.println("Third person is older & Second person is younger");
        else if(b>a && a>c)
        System.out.println("Second person is older & Third person is younger");
        else if(a>c && c>b)
        System.out.println("First person is older & Second person  is younger");
        else if(c>b && b>a)
        System.out.println("Third person is older & First person  is younger");
        else if(b>c && c>a)
        System.out.println("Second is older & First person is younger");
        }
}

