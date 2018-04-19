package test;
import java.util.Scanner;
public class sumEvenOddProduct
{
	public static void main(String[] args) 
	{
		int n, rem,flag=0, res=0;
		Scanner in=new Scanner(System.in);
		n = in.nextInt();
		if(n<0)
		{
			System.out.println ("Number too small");
			flag=1;
		}
		if(n>32767)
		{
			System.out.println ("Number too large");
			flag=1;
		}
		if(flag==0)
		{
			while(n!=0)
			{
				rem=n%10;
				res=res+rem;
				n=n/10;
			}
			System.out.print(res);
		}
	}
}
