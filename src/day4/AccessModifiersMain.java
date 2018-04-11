package day4;

public class AccessModifiersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers1 ob=new AccessModifiers1();
		System.out.println(ob.i1);
		System.out.println(ob.i2);
		System.out.println(ob.i3);
		System.out.println(ob.i4); // error
		
		ob.f1();
		ob.f2();
		ob.f3();
		ob.f4(); //error
		ob.f5();
		

	}

}
