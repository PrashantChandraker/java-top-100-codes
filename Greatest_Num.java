package basic_numbers;
import java.util.*;
public class Greatest_Num 
{
	public String greatest(int a, int b)
	{
		if(a>b)
			return (a + " is the greatest number");
		else if(a<b)
			return (b + " is the greatest number");
		else
			return "Both are is equall";
	}
	
	public static void main(String[] args) 
	{
		int x;
		int y;
		System.out.println("Enter the numbers");
		Scanner s = new Scanner (System.in);
		x=s.nextInt();
		y=s.nextInt();
		s.close();
		Greatest_Num obj = new Greatest_Num();
		String result = obj.greatest(x,y);
		System.out.println( result);
	}

}
