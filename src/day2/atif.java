package day2;
//main

 class atif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ob=new Add();
		Add ob1=new Add();
		Add ob2=new Add();
		Add ob3=new Add();
		ob3.a=100;
		ob2.a=200;
		
		System.out.println(ob.add(10f, 20f));
		System.out.println(ob.add(10.2f, 20.2f));
		System.out.println(ob.add(10,ob));
		System.out.println(ob.add(10.2f, 20));
		System.out.println(ob.add(10, 20.2f));
		System.out.println(ob.add("10", "20"));
	}

}
// Public class file
public class Add {
	/*int add(int a,int b)
	{
		return a+b;
	}*/
	int a;
	
	float add(float a,float b)
	{
		return a+b;
	}
	long add(long a,long b)
	{
		return a+b;
	}
	int add(float a,int b)
	{
		return (int)a+b;
	}
	int add(int a,float b)
	{
		return a+(int)b;
	}
	/*int add(int a,int b,int c)
	{
		return a+b+c; 
	}*/
	String add(String a,String b)
	{
		return a+b; 
	}
	
	int add(int x,Add...a)
	{
		int v=0;
		for(int i=0;i<a.length;i++)
		{
			v+=a[i].a;
		}
		return v;
	}
}
