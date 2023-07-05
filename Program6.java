package Conditional;
import java.util.*;
public class Program6 {
	public static void main(String args[])
	{
		Scanner s =  new Scanner(System.in);
		String str = s.next();
		if(str.charAt(0)>=65 && str.charAt(0)<=90)
		{
			System.out.println("First character is uppercase");
		}
		else
		{
			System.out.println("Not an uppercase");
		}
		s.close();
	}
}
