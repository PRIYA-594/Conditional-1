package Conditional;
import java.util.*;
public class Program09 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int mul = num*2;
		String res = (mul%2==0)?"Odd":"Even";
		System.out.println(res);
		s.close();
	}
}
