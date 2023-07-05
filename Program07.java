package Conditional;
import java.util.*;
public class Program07 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sq = num*num;
		String res = (sq%2==0)?"Even":"Odd";
		System.out.println(res);
		s.close();
	}
}
