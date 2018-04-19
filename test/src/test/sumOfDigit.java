package test;
import java.util.*;
public class sumOfDigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int rem;
	int sum=0;
	int temp=n;
	while(temp!=0){
		rem=temp%10;
		sum+=rem;
		temp=temp/10;
		
	}
		// TODO Auto-generated method stub
	System.out.println(sum);

	}

}
