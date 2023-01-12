package basic_numbers;
import java.util.*;
public class fibonacci 
{
	public void get_fibonaci(int a)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1 + " ");
		 System.out.print(n2 + " ");
		for(int i=3 ; i<=a ; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(n3 + " ");
		}
	}
	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		x=s.nextInt();
		s.close();
		fibonacci obj = new fibonacci();
		obj.get_fibonaci(x);
	}

}
