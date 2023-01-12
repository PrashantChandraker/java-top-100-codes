package basic_numbers;
import java.util.*;
public class Prime_Range
{
	public String get_prime(int a, int b)
	{
		//int count=0;
		for(int i=a ; i<=b ; i++)
		{
			int count=0;
			//System.out.println(count);
			for(int k=1 ; k<=i ; k++)
			{
				
				if(i%k==0)
				{
					count++;
				}
			}
				if(count==2)
				//return (i + "");
				System.out.println(i);
		}
		return " ";
	}
	public static void main(String [] args)
	{
		int x,y;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		x=s.nextInt();
		System.out.println("Enter the 2nd number");
		y=s.nextInt();
		s.close();
		Prime_Range obj = new Prime_Range();
		String output = obj.get_prime(x, y);
		System.out.println(output);
	}
}
