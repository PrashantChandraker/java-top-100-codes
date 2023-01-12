package basic_numbers;

import java.util.Scanner;

public class Leap_year 
{
 public String get_leap_year(int a)
 {
	 if(a % 400 == 0)
		 return (a + " is a leap year");
	 else if(a % 4 == 0    &&    a % 100 != 0)
		 return (a + " is a leap year");
	 else
		 return "not a leap year";
 }
	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the number to check");
		Scanner S = new Scanner(System.in);
		x=S.nextInt();
		S.close();
		
		Leap_year obj = new Leap_year();
		String Result = obj.get_leap_year(x);
		System.out.println(Result);

	}

}
