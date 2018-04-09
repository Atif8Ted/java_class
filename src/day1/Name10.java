/**
 * q1)Write a java program to accept a  ten name and display the name
Disply all the name.
first character of name.
total characters in name.
 */

package day1;
import java.util.*;
public class Name10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		String [] names =new String[3];
		for(int i=0;i<10;i++){
			names[i]=x.nextLine();		
			
			
		}
		
		for(int i=0;i<10;i++){
			System.out.println("\n"+names[i]);
			
		}
x.close();
	}
	

}
