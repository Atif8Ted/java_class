/**
 * 
 */
package test;
import java.util.*;
/**
 * @author 679961
 *
 */
public class threeFiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int product=1;
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		int rem=0;
		int temp=number;
		while(temp!=0){
			rem=temp%10;
			temp=temp/10;
			product=product*rem;
		}
		if(product%3==0 || product%5==0){
			System.out.println("3/5 Number");
		}
		else{
			System.out.println("Not 3/5 number");
		}
		// TODO Auto-generated method stub

	}

}
