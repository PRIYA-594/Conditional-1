package Conditional;
import java.util.*;
public class Program10 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		s.close();
	}
}
