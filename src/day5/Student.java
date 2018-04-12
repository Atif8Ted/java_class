package day5;

public class Student {
	int id;
	String name;
//	public char[] m1;
	public Student(int id,String name) {
		/**
		 * name=name;
		 * 
		
		id=id; -->it will give preference to local variable ie method variable and will fill id = id and name -=name in same l.
		// TODO Auto-generated constructor stub
		 
*/
		this.name=name;
		this.id=id;
		}
	public void display(){
		System.out.println("ID= "+id +" \name="+name);
		
	}
	class Marks{
		int m1,m2,m3;
		public void setdata(int m1,int m2,int m3){
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
			
		}
		public void display1(){
			display();
			System.out.println(m1+"\n" +m2+"\n+"+m3+"\n");
		}
	}

}
