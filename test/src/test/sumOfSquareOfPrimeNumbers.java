package test;
import java.util.Scanner;
public class sumOfSquareOfPrimeNumbers
{
	public static void main(String[] args) 
	{
		int i,j, n, sum=0,flag=0, count=0;
		Scanner in=new Scanner(System.in);
		n = in.nextInt();
		int result=0;
		int prime[]=new int[n];
		int k=0;
		if(n<0)
		{
			System.out.println ("Number too small");
//			flag=1;
		}
		if(n>32767)
		{
			System.out.println ("Number too large");
//			flag=1;
		}
			for(i = 1;i<=n;i++)
			{
				count=0;
				for(j=1;j<=i;j++)
				{
					if(i%j==0)
					count++;
				}
				if(count==2){
					prime[k]=i;
					k++;
				}
				
//				sum=sum+(i*i);
		
			}
			for(int ik=0;ik<k;ik++){
				result=result+(prime[ik]*prime[ik]);
				
				
				
			}
			System.out.println(result);
			
			
		
	}
}
