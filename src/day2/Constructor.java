package day2;

public class Constructor {
void f1(){
	System.out.println("I am in f1");
	
}
Constructor(int e){
	System.out.println("I am in one argument constructor");
	System.out.println(e);
}

Constructor(int x,int y){
	this(2);
	System.out.println("2 Argument constructor");
	
}
Constructor(){
	System.out.println("No argument constructor");
}
}
