package day1;
import java.util.*;

public class Arrayobj{
	public static void main(String args[]){
		Addition ob[]=new Addition[3];
		ob[0]=new Addition();
		ob[1]=new Addition();
		ob[2]=new Addition();
		Scanner sc=new Scanner(System.in);
	/**	
	 * the same we will do with for loop
	 * ob[0].setdata(sc.nextInt(),sc.nextInt());
		ob[0].display();
		ob[0].add();
		ob[0].display();
		ob[1].setdata(sc.nextInt(),sc.nextInt());
		ob[1].display();
		ob[1].add();
		ob[1].display();
		ob[2].setdata(sc.nextInt(),sc.nextInt());
		ob[2].display();
		ob[2].add();
		ob[2].display();
		
		*/
		
		for(int i=0;i<ob.length;i++){
			ob[i].setdata(sc.nextInt(),sc.nextInt());
			ob[i].display();
			ob[i].add();
			ob[i].display();
			System.out.println();
			
		}
	}
}