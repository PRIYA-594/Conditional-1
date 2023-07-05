package Conditional;
import java.util.*;
public class Program1 {
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==1)
		{
			System.out.println("January");
		}
		else if(n==2)
		{
			System.out.println("February");
		}
		else if(n==3)
		{
			System.out.println("March");
		}
		else if(n==4)
		{
			System.out.println("April");
		}
		else if(n==5)
		{
			System.out.println("May");
		}
		else if(n==6)
		{
			System.out.println("June");
		}
		else if(n==7)
		{
			System.out.println("July");
		}
		else if(n==8)
		{
			System.out.println("Augest");
		}
		else if(n==9)
		{
			System.out.println("September");
		}
		else if(n==10)
		{
			System.out.println("October");
		}
		else if(n==11)
		{
			System.out.println("November");
		}
		else if(n==12)
		{
			System.out.println("December");
		}
		else
		{
			System.out.println("Not a month Number");
		}
		s.close();
	}
}
