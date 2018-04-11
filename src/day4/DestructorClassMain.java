package day4;

public class DestructorClassMain {

	public static void main(String[] args) {
		
		DestructorClass dd =new DestructorClass();
		dd.f1();
		dd=null;
		DestructorClass dd1 =dd;
		dd1=null;
		dd=null;
		new DestructorClass().f1(); // automaticall goes to garbage collection
		System.gc(); // if we dont call Sysye.gc() then garbage collector will not collect immediatory  it will do the garbage collection acordint to its mind.
		//but when we do gc() it will come instantly garbage collector.
		// TODO Auto-generated method stub

	}

}
