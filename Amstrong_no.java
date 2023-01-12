 package basic_numbers;
import java.lang.Math;
import java.util.Scanner;

public class Amstrong_no
{
	public String get_Amstrong(int a)
	{
		//371
		double count=0;
		int b=a;
		int c=a;
		while(b!=0)
		{
			b=b/10;
			count++;
		}
		
		double rem=0;
		double Ams=0;
		while(a!=0)
		{
			rem=a%10;
			a=a/10;
			Ams=Ams+(Math.pow(rem, count));
		}
		
		if(Ams==c)
			return "Amstrong no.";
		else
			return "not amstrong no.";
	}
	public static void main(String[] args) 
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers to get check");
		x=s.nextInt();
		s.close();
		Amstrong_no obj = new Amstrong_no();
		String result = obj.get_Amstrong(x);
		System.out.println(result);
		
	}

}
