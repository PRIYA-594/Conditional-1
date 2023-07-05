package Conditional;
import java.util.*;
public class Program05 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int f = num/100;
		int l = num%100;
		System.out.println(f+l);
		s.close();
	}
}
