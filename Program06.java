package Conditional;
import java.util.*;
public class Program06 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int sum =0;
		int n = str.length();
		for(int i=0;i<2;i++)
		{
			sum += (int)str.charAt(i);
	        sum += (int)str.charAt(n-1-i);
		}
		System.out.println(sum);
		s.close();
	}
}
