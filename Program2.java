package Conditional;
import java.util.*;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char ch  = s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+" is a Vowel");
		}
		else
		{
			if(ch<=57 && ch>=48)
			{
				System.out.println(ch+" is Not a letter");
			}
			else if(ch=='@'||ch=='#'||ch=='$'||ch=='&')
			{
				System.out.println(ch+" is Not a letter");
			}
			else
			{
				System.out.println(ch+" is a consonant");
			}
		}
		s.close();
	}
}
