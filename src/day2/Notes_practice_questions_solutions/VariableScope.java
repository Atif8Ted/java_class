package day2.Notes_practice_questions_solutions;

public class VariableScope {
	int instance_variable; // prints zero if not initialised
	static  String class_variable="EEC"; // prints null if not initialised

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableScope obj=new VariableScope();
		VariableScope obj1=new VariableScope();
		obj.instance_variable=100;
		obj1.instance_variable=400;
		System.out.println(obj.instance_variable); // o/p=0 , instance variable
		System.out.println(obj1.instance_variable);
		System.out.println(class_variable);// can be accesed without any object instance ;

	}

}
