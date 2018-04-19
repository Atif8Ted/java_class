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
		int a=2002;
		int temp=a;
		String n1=Integer.toString(a);
		int size=n1.length();
		int ar[]=new int[6];
		for(int i=0;i<size;i++) {
			ar[i]=temp%10;
			temp=temp/10;
		}
		
		System.out.println(n1);
		String n2="";
//		String n2=Arrays.toString(ar);
		for(int i=0;i<size;i++) {
			n2=n2+""+ar[i];
		}
//		n2=n2;
//		n1=n1;
		System.out.println(n2);
		
		if(n1.equals(n2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	

}
