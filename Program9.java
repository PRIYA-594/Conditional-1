package Conditional;
import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String st[]=str.split(" ");
		int w = st.length;
		int n = 0;
		int sp = 0;
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>=48 && ch <=57)
			{
				n++;
			}
			else if((ch>=33 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=126))
			{
				sp++;
			}
		}
		System.out.println("Words:"+w+"\nNumbers:"+n+"\nSpecial Characters:"+sp);
		s.close();
	}
}
