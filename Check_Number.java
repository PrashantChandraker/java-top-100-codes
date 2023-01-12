package basic_numbers;
import java.util.*;
public class Check_Number 
{
	public String Positive_negative(int a)
	{
		if(a<0)
			return "Negative Number";
		else if(a>0)
			return "Positive Number";
		else
			return "Zero Number";
	}
	public static void main(String[] args)
	{
		int x;
		System.out.println("Enter the number to check");
		Scanner S = new Scanner(System.in);
		x=S.nextInt();
		S.close();
		
		Check_Number obj = new Check_Number();
		String Result = obj.Positive_negative(x);
		System.out.println("the given input is " + Result);
	}

}
