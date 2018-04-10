package day3;

public class EnumExampleMain {

	public static void main(String[] args) {
		EnumExample ob;
		ob=EnumExample.valueOf("sunday");
		System.out.println(ob);
		System.out.println(ob.owner);
		System.out.println(ob.color);
		ob=EnumExample.valueOf("friday");
		System.out.println(ob);
		System.out.println(ob.owner);
		System.out.println(ob.color);
		
	}

}
