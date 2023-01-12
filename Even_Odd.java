package basic_numbers;
import java.util.*;
public class Even_Odd
{
	public String even_odd_check(int a)
	{
		if(a==0)
			return "Zero";
		else if (a>0)
			{
				if(a%2==1)
					return "odd";
				else
					return "Even";
			}
		else
			return "Negative";
	}
	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the input number");
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		s.close();
		
		Even_Odd obj = new Even_Odd();
		String Result = obj.even_odd_check(x);
		System.out.println("The given number "+ x +" is "+ Result);
	}

}
