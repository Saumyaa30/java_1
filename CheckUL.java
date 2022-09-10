/*QUESTION NO. 11*/
import java.util.Scanner;
public class CheckUL
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the character:  ");
    char a = sc.next().charAt(0);
    if(a>=65 && a<=90)
    {
    System.out.println(a+" is an upper case letter ");
    }
    else if(a>=97 && a<=122){
    System.out.println(a+" is a lower case letter ");
    }
    else
    {
    System.out.println(a+" is not an Alphabets ");
    }
}
}