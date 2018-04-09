## Question on these topics will be from runtime error , compilation error and to identify output
- [ ] Points to ponder

<i> Refer to this link for further clarification</i><br>
http://www.fredosaurus.com/notes-java/data/variables/40variables.html<br>
https://www.tutorialspoint.com/java/java_variable_types.htm<br>
### Scopes
<b> a) Local Scopes</b> (block scope and method scope)--> <i>in if block , while block </i> 
-->if a variable is declared in a block it can be redeclared in another block , cause it is a local variable.
* in same method they can't be initialized twice
* All local scope variables are not auto initialized. You have to manually initialise it.
* Block variable name and method variable name can't be same.
* the block variable i.e local variable will be given higher priority .
>>example:

```java

PSVM{
int i=10;
{

int i=12;
print(i); <-- it will print 12 , not 10 <-- local scope priority
}
}

```
<b>Important</b>
>>
* Static variable name and instance variable name cant be same .
* instance variable and method varibale
* This operator. --> exampe : consider variable is a, so simply a will mean method variable and this.a will mean instansnce variable( may be global)
* variable declared in one method cant be recognized in another method.
* variable available in one instance can't be accessed in another instance
* can we have static/public inside a method or a block ?? No -->compilation error



### Instance Scope
>> The variable we declare outside the method but inside the class;
* All instance variable is auto initialized .
```java

class test{
int i; // instance variable is i
void method(){
int z;
}

}

```
>> this variable will be created along the instance .
* Every instance will have different copy of instance variable.
*

```java
A ob;
print(ob.a) //compilation error

```

```java
ob=new A();
print(ob.a) //Now works . --> a is some instance variable in class A.

```
### Class variable
```java
class A{
int a,b; // instance variable
Static int c// class variable <-- if we add static it is class variable and if we remove it is instance variable

}
```

* Class/static variable can be even used without creating instance . or after deleting instance we can still use it .


## Class
*A class can have another class, nested class, methods ...

## Methods 
* Methods can have a class inside it .
*A<b> mehtod can't have a method insidde it .</b>
>> Three types of methods
* Managerial methods <-- It is a method , which get executed withouot human interface .<br>
Ex:  Constructors and destructors
* Instance Method
* Class Method ( if we add keyword static it will be class method , if we remove it is instance method)

* class methods can access class methods and class variables and not instance methods and variables.
* <b>Instance method can access instance method and class method as well as variables.</b>
* <b>In a class two method can not have same signature ?? </b>

## Note:
* Class name and method name can be same;

## Wrapper classes

<b>Integer.valueof()</b> <br>
* Integer and int
* Float and float
* <b> Boxing -> putting a primitive datatype into wrapper class </b>
* Unboxing.

## Arguments
```java
 f1()
 f1(int i) // passing primitive
 f1(Integer a) // passing wrapper class
 f1( String s) // String is not a wrapper class , it is a normal class.
 f1(A.x) //passing objects

```

## Return type

```java
void f1()
A[] f1() // array of objects return type.

```

## Method overloading 

## Constructor
>> Read about it in details
* To create object of a class a default constructor is need .
>> Constructor overloading
* One constructor can call another constructor
* Constructor can call constructor and methods but methods can't call constructor

* <b>Constructor call another constructur using this and super .</b>

* <b> Can a constructor be static ?? --> No</b>
* <b> Can a constructor be private ?? --> 
* <b> Static block will execute only once is a lifetime while non static will execute for each instance </b> 
