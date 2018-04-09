package day1;
import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello , My forst progrma "); //Syso and ctrl + space.
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=a+b+c;
		System.out.println("Sum="+d);

	}

}

class Demo3{
	public static void main(String [] args){
	Scanner x=new Scanner(System.in);
	int m=x.nextInt();
	int n=x.nextInt();
	int res=m+n;
	System.out.println("Sum="+res);

	}
}
//two public classes can't be in a single package.
/*public class Demo3{
	
}
*/
