package day3;
/**
 * ### 
### Q1. Create a clas matrix of the given size .
- [X] i)If size is not specified then matrix is 3 X 3
- [X] ii) It should adopt another matrix
 iii)It should have:
- [X] copy constant
- [X] Read method
- Display method
iV)And a method to add 2 matrix;
v) Method to check matrix is scalar or not
 * @author 679961
 *
 */
public class MultiDimArray {
	int arr[][];
	
	//Constructor -->sets size of matrix to 3 X 3
	MultiDimArray() {
		arr=new int[3][3];
}
	MultiDimArray(int m,int n){
		arr=new int[m][n];
	}
	
	MultiDimArray(int a[][]){
		arr=a;
	}
	
	MultiDimArray(MultiDimArray n){
		this.arr=n.arr;
	}
	
	void read(){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=MultiDimArrayRead.sc.nextInt();
			}
		}
	}
	
	void display(){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.println(arr[i][j]+" ");
			}
		}
//		System.out.println();
	}
	
	 void addTwoMatrix(MultiDimArray ob1,MultiDimArray ob2){
		if(ob1.arr.length==ob2.arr.length){
			if(ob1.arr[0].length==ob2.arr[0].length){
			for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr[0].length;j++){
						this.arr[i][j]=ob1.arr[i][j]+ob2.arr[i][j];
					}
				}
		}
			else{
				System.out.println("Rows and columns are not equal");
				System.exit(1);
			}
		}
		
		
	}
	 
	 void ScalarMatrix(){
		 int p = 0, q = 0, x = arr[0][0]; // 'x' is storing the 1st main diagonal element
         
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr[0].length;j++)
	            {
	                /* Checking that the matrix is diagonal or not */
	                if(i!=j && arr[i][j]!=0) // All non-diagonal elements must be zero
	                {
	                    p=1;
	                    break;
	                }
	                /* Checking the matrix for scalarity */
	                // All main diagonal elements must be equal to 'x' and non-zero
	                if(i==j && (arr[i][j]==0 || arr[i][j]!=x)) 
	                {
	                    q=1;
	                    break;
	                }
	            }
	        }
	         
	        if(p==0 && q==0)
	            System.out.println("The matrix is scalar");
	        else
	            System.out.println("The matrix is not scalar");
	    }
	
	 }
	
	

