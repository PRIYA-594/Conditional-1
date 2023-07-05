package Conditional;
import java.util.*;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String bin = Integer.toString(num,2);
		int c=0;
		for(int i=0;i<bin.length();i++)
		{
			if(bin.charAt(i)=='1')
			{
				c++;
			}
		}
		System.out.println(c);
		s.close();
	}
}
