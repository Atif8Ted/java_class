package day3;
/**
 * Day owner and stones wala question answer
 * @author 679961
 *
 */
// constructor is never publicin Enum 
public enum EnumExample {
	sunday("Sun","red"),monday("Moon","Sunday"),tuesday("Mars","red orange"),wednesday("Mercury","green"),thursday("jupiter","yellow"),friday("venus","white"),saturday("saturn","black");
	
	String owner, color;
	EnumExample(String s1, String s2){
		owner=s1;
		color=s2;
	}
}
