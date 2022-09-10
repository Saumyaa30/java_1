/*QUESTION NO.7 */
import java.util.Scanner;
class inpout
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    if(n<0)
    {
        System.out.println(-n);
    }
    else
    {
        System.out.println(n);
    }
    }
}