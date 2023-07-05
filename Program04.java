package Conditional;
import java.util.*;
import java.lang.Math;
public class Program04 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = 3;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int f =0;
		if(arr[0]==arr[1]+1)
		{
			if(arr[1]==arr[2]+1)
			{
				f=1;
			}
		}
		if(arr[0]-1==arr[1])
		{
			if(arr[1]-1==arr[2])
			{
				f=1;
			}
		}
		String res = (f==0)?"Not Consecutive":"Consecutive";
		System.out.println(res);
		s.close();
	}
}
