package day5;

public class StudentMain {

	public static void main(String[] args) {
		Student sc=new Student(123,"Kaliswaran");
		Student.Marks sm=sc.new Marks();

		System.out.println(sc.id);
		System.out.println(sc.m1);
		sc.display();
		sm.display1();
		// TODO Auto-generated method stub

	}

}
