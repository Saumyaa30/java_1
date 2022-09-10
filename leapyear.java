/*LEVEL 2 QUESTION 1*/
import java.util.Scanner;
public class leapyear
 {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Year to check it's Leap year or Not: ");
	    int y = sc.nextInt();
	    if(y % 100 == 0) 
		{
	    	if ((y % 400 == 0) && (y % 4 == 0))
			{
	    	System.out.println("Leap Year");
	    	}
			else
			{
	    		System.out.println("Not a Leap Year");
	    	}
	    }
		else 
		{
	    	if(y % 4 == 0) 
			{
	    		System.out.println("Leap Year");
	    	}
			else 
			{
	    		System.out.println("Not a Leap Year");
	    	}
	    }
	}

}