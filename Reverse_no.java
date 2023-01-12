package basic_numbers;
import java.util.*;
public class Reverse_no
{
	public int get_reverse(int a)
	{
		int rev=0;
		int rem=0;
		while(a!=0)
		{
			rem=a%10;
			a=a/10;
			rev = (rev * 10) + rem;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers to get reverse");
		x=s.nextInt();
		s.close();
		Reverse_no obj = new Reverse_no();
		int result = obj.get_reverse(x);
		System.out.println("the reverse of the given number is " + result);
		
	}

}
