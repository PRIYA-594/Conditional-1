package Conditional;
import java.util.*;
public class Program01 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String str = Integer.toString(num);
		int c = str.length();
		int mid = c/2;
	    while(mid!=0)
	    {
	    	num=num%10;
	    	mid/=10;
	    }
	    String res = (num%2==0)?"Even":"odd";
	    System.out.println(res);
		s.close();
	}
}
