package day1;

import java.util.Scanner;

public class MainForAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ob=new Addition();
		System.out.println("Enter the two value");
		Scanner sc=new Scanner(System.in);
		ob.setdata(sc.nextInt(),sc.nextInt());
		ob.display();
		ob.add();
		ob.display();
		

	}

}
