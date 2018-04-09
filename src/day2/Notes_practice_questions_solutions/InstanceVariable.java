package day2.Notes_practice_questions_solutions;
import java.io.*;

public class InstanceVariable { // stores employee name and salary

	public String name; //this instance variable for any child class
	
	private double salary; //salary is visible in InstanceVariable class only
	
	//the name variable is assigned in the constructor.
	public InstanceVariable(String empName){
		name=empName;
	}
	
	public void setSalary(double empSal){
		salary=empSal;
	}
	
	//This method prints the employee details.
	public void printEmp(){
		System.out.println("name : "+name);
		System.out.println("Salary : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable empOne=new InstanceVariable("Rajesh");
		empOne.setSalary(200000);
		empOne.printEmp();

	}

}
