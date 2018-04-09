package day2.Notes_practice_questions_solutions;

public class LocalScope {
	public void testAge(){
		int age =0; // you have to initialise it . Local variable Can't be initialised automatically  
		age=age+7;
		System.out.println("Value of age is "+age);
	}

	public static void main(String[] args) {
		LocalScope test=new LocalScope();
		test.testAge();
		// TODO Auto-generated method stub

	}

}
