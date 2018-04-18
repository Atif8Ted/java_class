/**
 * 
 */
package test;
import java.util.*;
import java.util.Arrays;

/**
 * @author atif
 *
 */
public class palindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=220012;
		int temp=a;
		int ar[]=new int[6];
		for(int i=0;i<6;i++) {
			ar[i]=temp%10;
			temp=temp/10;
		}
		
		String n1=Integer.toString(a);
		System.out.println(n1);
		String n2="";
//		String n2=Arrays.toString(ar);
		for(int i=0;i<6;i++) {
			n2=n2+""+ar[i];
		}
		n2=n2;
		n1=n1;
		System.out.println(n2);
		
		if(n1.equals(n2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	

}
