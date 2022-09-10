/*QUESTION NO.9*/import java.util.Scanner;
class Medical
{
  public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Do you have a disability or not");
 System.out.println("Press y or n");
 char s = sc.next().charAt(0);
 if(s=='y')
 {
    System.out.println("You are not eligible");
 }
 else
 {
    System.out.println("You are eligible");
 }

}
}