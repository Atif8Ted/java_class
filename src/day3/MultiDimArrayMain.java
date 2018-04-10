package day3;

public class MultiDimArrayMain {

	public static void main(String[] args) {
		MultiDimArray ob3=new MultiDimArray(2,2);
		MultiDimArray ob1=new MultiDimArray(2,2);
		MultiDimArray ob2=new MultiDimArray(2,2);
		System.out.println("Enter for ob1");
		ob1.read();
		
//		ob2.display();
		System.out.println("Enter for ob2");
		ob2.read();
//		ob2.display();
		ob3.addTwoMatrix(ob1, ob2);
		ob3.display();
		
		
		
		// TODO Auto-generated method stub

	}

}
