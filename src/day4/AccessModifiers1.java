package day4;

public class AccessModifiers1 {
	public int i1=0;
	protected int i2=20;
	int i3=30;
	private int i4=40;
	public void f1(){
		System.out.println("I am in f1"+i4);
	}
	
	protected void f2(){
		System.out.println("I am in f2");
	}
	
	 void f3(){
		System.out.println("I am in f3");
	}
	 private void f4(){
			System.out.println("I am in f4");
		}
	 
	 public void f5(){
		 f4();
	 }
	 
	 AccessModifiers1() {
		// TODO Auto-generated constructor stub
		 System.out.println("I am in constructor");
	}
	

}
