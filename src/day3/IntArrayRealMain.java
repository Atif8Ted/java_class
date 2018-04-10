package day3;

public class IntArrayRealMain {
	public static void main(String args[]){
//		IntArray it =new IntArray();
//		IntArray it =new IntArray(4);
		IntArray it=new IntArray(new int[]{5,4,4,3,3,2,1,1});
		it.display();
		IntArray it1=new IntArray(it);
		it1.display();
		it1.duplicate();
		it1.display();
//		it.sort();
//		it.display();
		
		
	}

}
