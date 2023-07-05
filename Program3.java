package Conditional;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch>=57 && ch<=48)
		{
			System.out.println(ch+" is a Digit");
		}
		else
		{
			System.out.println(ch+" is not a Digit");
		}
		s.close();
	}
}
