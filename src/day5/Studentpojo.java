package day5;

public class Studentpojo {
	public void displayrank(StudentBean ob){
		if(ob.getMarks()<35){
			System.out.println("Fail");
		}
		else{
			System.out.println(ob.getName()+"Passed");
		}
		
	}

}
