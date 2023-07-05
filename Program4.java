package Conditional;
import java.util.*;
public class Program4 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String n = Integer.toString(num);
		int len = n.length();
		int c =1;
		while(--len!=0)
		{
			c*=10;
		}
		int f = num/c;
		if(f==(num%10))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		s.close();
	}
}
