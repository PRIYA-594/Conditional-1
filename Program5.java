package Conditional;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = Integer.toString(n);
		if(str.length()%2==0)
		{
			System.out.println("The given digit is Even");
		}
		else
		{
			int len = str.length();
			int mid =(str.charAt(len/2));
			if(mid % 2 ==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("odd");
			}
		}
		s.close();
	}
}
