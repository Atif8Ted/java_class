/**
 * q1)Write a java program to accept a name and display the name
Disply all the name.
first character of name.
total characters in name.
 */

package day1;
import java.util.*;

public class Name {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		String name =x.nextLine();
		System.out.println(name);
//		System.out.println(name);
		System.out.println(String.valueOf(name.charAt(0))); //string.charat(0))
		System.out.println(name.length());
		
		// TODO Auto-generated method stub
		x.close(); //to close the scanner to prevent memory leak

	}
	
	

}
