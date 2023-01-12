package basic_numbers;
import java.util.*;
public class Prime_no
{
	public String get_prime(int a)
	{

		int count = 0;
		for(int i=1 ; i<=a ; i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==2)
		return "prime number";
		else
			return "not a prime number";
	
	}
	public static void main(String args[])
	{
		int x;
		System.out.println("Enter the number to check");
		Scanner S = new Scanner(System.in);
		x=S.nextInt();
		S.close();
		
		Prime_no obj = new Prime_no();
		String Result = obj.get_prime(x);
		System.out.println(Result);

	}

}
