package day2.Notes_practice_questions_solutions;

public class Variable_Local {
	void m1() {
		int i;
	}
	
	i=10; // throws error cause i is local variable and can't be accesed outside the blok or method m1()
	/*Variable_Local() {
	// TODO Auto-generated constructor stub
		i++; // throws error cause local variable is not auto initiatied
		System.out.println(i);
	}
	
	*/
	public static void main(String args[]) {
		Variable_Local obj=new Variable_Local();
		
	}

}
