package day1;

import java.util.Scanner;

public class EmployeeOb {

	public static void main(String[] args) {
		Employee ob[]=new Employee[3];
		ob[0]=new Employee();
		ob[1]=new Employee();
		ob[2]=new Employee();
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<ob.length;i++){
			System.out.println("Enetr Name and AGE");
			ob[i].setEmpData(sc.nextLine(),sc.nextInt());
			sc.nextLine();
//			
			ob[i].displayData();
//			System.out.println();
//			sc.next();
		}

		// TODO Auto-generated method stub

	}

}
