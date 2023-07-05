package Conditional;
import java.util.*;
public class Program03 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int fnum = num/1000;
		String res = (fnum%4==0 && fnum%100==0 || fnum%400==0)?"Leap Year":"Not a leap year";
		System.out.println(res);
		s.close();
	}
}
