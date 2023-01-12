package basic_numbers;
import java.util.*;
public class Palindrome 
{
	public String get_palindrome(int a)
	{
		int b=a;
		int rev=0;
		int rem=0;
		
		while(a!=0)
		{
			rem=a%10;
			a=a/10;
			rev = (rev * 10) + rem;
		}
		
		if(rev==b)
		{
			return "Palindrome number";
		}
		else
		{
			return "not a palindrome number";
		}
	}
	
	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers to check ");
		x=s.nextInt();
		s.close();
		Palindrome obj = new Palindrome();
		String result = obj.get_palindrome(x);
		System.out.println(result);
		
	}

}
