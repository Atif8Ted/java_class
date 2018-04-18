/**
 * 
 */
package test;

/**
 * @author atif
 *
 */
public class palindromestring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naamaan";
		System.out.println(s);
		int size=s.length();
		String rev="";
		for(int i=size-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

}
