package day1;
import java.util.*;

public class OperationOnNumbers {
	int num;
	void setNum(int x){
		num=x;	
	}
	void OddOrEven(){
		if(num%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		
		
	}
	void PrimeorNot(){
		int temp;
		boolean isPrime=true;
		//capture the input in an integer
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	}
	
	void ArmstrongOrNor(){
		if(num>0){
			int c=0,rem,temp;
			temp=num;
			while(num>0){
				rem=num%10;
				num=num/10;
				c=c+(rem*rem*rem);
				
			}
			if(temp==c){
				System.out.println("Armstron Number");
			}
			else{
				System.out.println("Not an Armstrong Number");
			}
		}
		
		
	}
	
	void FriendorNot(){
		 int counter = 1;
		    int tmpNumber = num;
		    while (tmpNumber / 10 >= 1)
		    {
		        counter ++;
		        tmpNumber = tmpNumber / 10;
		    }

		    boolean check = true;

		    for (int i = 1; i <= counter; i++)
		    {


		        if ((int)(num / Math.pow(10, (counter - i))) % i == 0 && check)
		        {
		            System.out.println("Friendly Number");
		        }
		        else
		        {
		            System.out.println("Not a friendly number");
		        }



		    }
	}
}
