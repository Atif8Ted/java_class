package test;
import java.util.*;
public class aboveAverageMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int size=sc.nextInt();
		float average=0,sum=0;
		float marks[]=new float[size];
		for(int i=0;i<size;i++){
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
		}
		average=sum/size;
		for(int i=0;i<size;i++){
			if(marks[i]>=average){
				System.out.println((int)marks[i]);
			}
		}
		sc.close();

	}

}
