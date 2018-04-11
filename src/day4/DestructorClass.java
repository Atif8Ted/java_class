package day4;

public class DestructorClass {
	
public DestructorClass() {
	// TODO Auto-generated constructor stub
	
	System.out.println("I am in constructor");
}

public void f1(){
	System.out.println("I am in a function");
}

public void finalize(){
	System.out.println("I am in destructor");
}
}
