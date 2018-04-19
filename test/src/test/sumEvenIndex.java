package test;
import java.util.*;
public class sumEvenIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int [size];
		int sum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				sum=sum+(i+1);
			}
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
