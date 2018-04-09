package day2.Notes_practice_questions_solutions;

/*public class VariableScope2 {
	int i=0;
	VariableScope2(){
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableScope2 obj=new VariableScope2();
		VariableScope2 obj1=new VariableScope2();
		VariableScope2 obj2=new VariableScope2();
		VariableScope2 obj3=new VariableScope2();
		VariableScope2 obj4=new VariableScope2(); //will print 1 five times  intead of  printing i=5 ;
	}

}
*/

public class VariableScope2 {
	 static int i=0;
	VariableScope2(){
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableScope2 obj=new VariableScope2();
		VariableScope2 obj1=new VariableScope2();
		VariableScope2 obj2=new VariableScope2();
		VariableScope2 obj3=new VariableScope2();
		VariableScope2 obj4=new VariableScope2(); //print 1 2 3 4 5 cause static
	}

}
