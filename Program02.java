package Conditional;
import java.util.*;
public class Program02 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		String str = Integer.toString(num);
		int c = str.length();
		String res = (c%2==1)?"odd":"Even";
		System.out.println(res);
		s.close();
	}
}
