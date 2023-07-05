package Conditional;
import java.util.*;
import java.lang.Math;
public class Program08 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int cube = (int)Math.pow(num, 3);
		String res =(cube%2==1)?"odd":"Even";
		System.out.println(res);
		s.close();
	}
}
