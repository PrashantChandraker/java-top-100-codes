package basic_numbers;
import java.util.*;
public class sum_of_Digits 
{
	public int get_sum(int a)
	{
		int sum=0;
		while(a!=0)
		{
			sum=sum+(a%10);
			a=a/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers to add");
		x=s.nextInt();
		s.close();
		sum_of_Digits obj = new sum_of_Digits();
		int result = obj.get_sum(x);
		System.out.println("the sum of the given number is " + result);
		
	}

}
