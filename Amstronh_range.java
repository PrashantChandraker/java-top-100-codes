package basic_numbers;
import java.lang.Math;
import java.util.Scanner;
public class Amstronh_range 
{
	public void get_Amstrong(int a, int b)
	{
		for(int i=a ; i<=b ; i++)
		{
			double count=0;
			int k=i;
			int c=i;
			int d=i;
			
			while(d!=0)
			{
				d=d/10;
				count++;
			}
			
			double rem=0;
			double Ams=0;
			
			while(k!=0)
			{
				rem=k%10;
				Ams=Ams+(Math.pow(rem, count));
				k=k/10;
			}
			if(Ams==c)
				System.out.println(c);
		}
	}
	public static void main(String[] args) 
	{
		int x;
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		x=s.nextInt();
		System.out.println("Enter the 2nd number");
		y=s.nextInt();
		s.close();
		Amstronh_range obj = new Amstronh_range();
		 //result = 
				 obj.get_Amstrong(x,y);
		//System.out.println(result);
		
	}

}



