## Types of array
* 1 Dimensional array
* 2 Dimensional array

### Ways to declare array

```java

int []a=new int[] ; //error , size must be specified
int []a=new int[5];
int [5]a =new int [] //error size declaration should be in RHS
int a1[]={10,20,30};
int 1[]=new int[] {10,20,30};
int a2[]; //error declarion is fragmented
a2={10,20,30};
```
```java

int a3[];
a3=new int[]{10,20,30};
int [][]=new int [3][3];
int b[][]=ewn int [3][3];
int []b[]=new int [3][3];
int [][]=new int [][3];//error
```
```java

int [][]b=new int [3][];
b[0]=new int [3];
b[1]=new int [5];
b[2]=new int [1];
```
```java

int [][]=b={{1,2},{3,4}};
int [][]=b={{1,2,5},{3,4}};
```
```java

int [][]b;
b={{1,2,5},{3,4}}; //error declaration is fragemented

int [][]b;
b=new int [][]{{1,2},{3,4}};
```