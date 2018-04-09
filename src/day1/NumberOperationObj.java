package day1;

import java.util.*;

public class NumberOperationObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationOnNumbers ob =new OperationOnNumbers();
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		ob.setNum(sc.nextInt());
		ob.OddOrEven();
		ob.PrimeorNot();
		ob.ArmstrongOrNor();
		ob.FriendorNot();
		
	}

}
