/**
 * 
 */
package test;
import java.util.*;

/**
 * @author 679961
 *
 */
public class changeNumber {
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
String check=Integer.toString(number);
//String n1=Integer.toString(number);
int size=check.length();

String str1="";
if(size==3){
	str1=str1+""+""+check.charAt(1)+""+check.charAt(2)+""+check.charAt(0);
	
}

int num2=Integer.parseInt(str1);
System.out.println(num2);
	/**
	 * @param args
	 */
sc.close();

}

}