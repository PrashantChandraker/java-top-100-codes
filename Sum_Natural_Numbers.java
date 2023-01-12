package basic_numbers;
import java.util.*;
public class Sum_Natural_Numbers
{
	public int sum_of_natural_number(int n)
	{
		int sum = 0;
		if(n>=0)
		{
			for(int i = 1; i<=n;i++)
			{
				sum = sum + i;
			}
			return sum;
			}
		else
			{
			for(int i=n ; i<=-1 ; i++)
			{
				sum = sum + i;
			}
			return sum;
			}
	}
	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the number");
		Scanner s = new Scanner (System.in);
		x=s.nextInt();
		s.close();
		Sum_Natural_Numbers obj = new Sum_Natural_Numbers();
		int output = obj.sum_of_natural_number(x);
		System.out.println("the sum of given number is " + output);
	}

}
