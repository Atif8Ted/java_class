package day3;
import java.util.*;
public class EnumPlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String planet=sc.nextLine();
	EnumPlanet ob;
	ob=EnumPlanet.valueOf(planet);
	System.out.println(ob);
	System.out.println(ob.volume);
	System.out.println(ob.hrs);
	ob=EnumPlanet.valueOf("Earth");
	System.out.println(ob);
	System.out.println(ob.volume);
	System.out.println(ob.hrs);
	sc.close();

	}

}
