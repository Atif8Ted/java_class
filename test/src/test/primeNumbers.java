package test;
import java.util.*;

public class primeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++ ){
			if(num%i==0){
				flag=false;
			}
			else{
				flag=true;
			}
		}
		
		if(flag!=false){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		// TODO Auto-generated method stub

	}

}
