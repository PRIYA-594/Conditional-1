package Conditional;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s =  new Scanner(System.in);
		String str = s.next();
		int i=0;
		char ch[]=str.toCharArray();
		for(char st:ch)
		{
			i++;
		}
		System.out.println(i);
		s.close();
	}
}
