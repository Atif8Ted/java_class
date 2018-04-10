package day3;

import java.util.Arrays;

/**
 * 2. Q2. Create a class for the following 
- a. To store integer array
- b. if the size is specified array should be of the given size otherwise default size should be 10.
- c. If the value of the elements is given , it should assign to the array ,otherwise default value should be zero.
- d. The class should be able to adopt another given array
>> * To read the data
>> * To sort the data
>> *    To eliminate duplicate
>> * To do search
>> * To reverse each element of the array .

 * @author 679961
 *
 */
public class IntArray {
	int arr[];
	
	//constructor --> set size of array=10 by default
	IntArray() {
		 arr=new int [10];
	}
	
	IntArray(int n){
		arr=new int[n];
	}
	
	IntArray(int n[]){
		arr=n;
	}
	
	// copy constructor
	IntArray(IntArray n) {
		this.arr=n.arr;
		
	}
	void read(){
		System.out.println("Enter the "+ arr.length + "elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=IntArrayMain.sc.nextInt();
		}
	}
	
	void display(){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	void sort(){
		Arrays.sort(arr);
	}
	
	void search(int n){
		int key=n;
		int temp[]=arr;
		Arrays.sort(temp);
		key=Arrays.binarySearch(temp, n);
		if(key<0){
			System.out.println("Not Found");
		}
		else{
			System.out.println("Found");
		}
	}
	
	void duplicate(){
		int temp[]=new int[arr.length];
		int temp1[]=new int[arr.length];
		int x=0;
		for(int i=0;i<arr.length;i++){
			Arrays.sort(temp);
			int k=Arrays.binarySearch(temp, arr[i]);
			if(k<0){
				temp[x]=arr[i];
				temp1[x++]=arr[i];

				
			}
		}
		arr=temp1;
	}
	
}
