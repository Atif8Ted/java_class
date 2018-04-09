package day2;

/**
 * 1. Q1. Create a class Addition with overloaded add method (Overlaoding.java)
 * @author Atif8ted
 *
 */
public class Overloading {
	int add(int a, int b){
		return a+b;
	}
	
	String add(String a,String b){
		return a+b;
	}
	
	int add(int a,float b){
		return a+ (int)a;
	}
	
	int add(int a,int b,int c){
		return a+b+c;
	}
	
	int add(int ...a){
		int v=0;
		for(int i=0;i<a.length;i++){
			v+=a[i];
		}
		return v;
		
	}
	
	int add( int a1,int ...a){
		int v=0;
		for(int i=0;i<a.length;i++){
			v+=a[i];
		}
		return v;
		
	}

}