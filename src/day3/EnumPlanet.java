package day3;
/**
 * Q2.  Accept name of the planet and display:
 
- Volume of the planet .
- How much time it takes the sunrays to reach on that planet.

*/

public enum EnumPlanet {
	Mercury(5555555,"8.3 hrs") , Venus(52323,"4.2 hrs"), Earth(2367,"2.1 hrs"), Mars(1212123,"1.2 hrs"), Jupiter(212312,"2.5 hrs") , Saturn(5454545,"9 hrs"),Uranus(1221,"10.2 hrs") , Neptune(1232,"10.1 hrs") , Pluto(12212,"1 hrs");
	
	float volume;
	String hrs;
	
	EnumPlanet(float vol,String h) {
		volume=vol;
		hrs=h;
	 	
	}

}
