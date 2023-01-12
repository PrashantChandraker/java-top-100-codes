package basic_numbers;
import java.util.*;
public class Greatest_3_num
{
	public String get_greatest(int a, int b, int c)
	{
		if(a==b && b==c && a==c)
			return "All three numbers are equall";
		else if(a>b && a>c)
			return (a + " is greater than " + b +" & "+ c);
		else if(b>a && b>c)
			return (b + " is greater than " + a +" & " + c);
		else if(c>a && c>b)
			return (c + " is greater than " + a +" & "+ b);
		else
			return "invalid numbers";
	}
	public static void main(String args[])
	{
		int x, y, z;
		System.out.println("enter the three numbers");
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		s.close();
		Greatest_3_num obj = new Greatest_3_num();
		String result = obj.get_greatest(x, y, z);
		System.out.println(result);
	}

}
