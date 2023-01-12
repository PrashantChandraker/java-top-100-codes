package basic_numbers;
import java.util.*;
public class Sum_betwn_Numbers
{
	public int get_sum(int a, int b)
	{
		int sum = 0;
		for(int i=a ; i<=b ; i++)
		{
			sum = sum + i;
		}
		return sum; 
	}
	public static void main(String[] args) 
	{
		int x, y;
		System.out.println("Enter the two numbers");
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		s.close();
		Sum_betwn_Numbers obj = new Sum_betwn_Numbers();
		int result = obj.get_sum(x, y);
		System.out.println("the sum of given numbers is = " + result);
	}

}
