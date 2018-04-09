package day1;

/**
 * Making the code more modular
 * @author 679961
 *
 */

public class Addition {
	int num1,num2,num3;
	void setdata(int x, int y){
		num1=x;
		num2=y;
	}
	
	void add(){
		num3=num1+num2;
	}
	
	void display(){
		System.out.println("Num1="+num1+"NUM2="+num2+"NUm3="+num3);
	}

}


