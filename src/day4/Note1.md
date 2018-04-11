### Important

* Q1. What is constructor . What is the purpose ?
>> Ams:
* Q2. What is destructor . And it,s purpose ?
>> Ams: Destructor are method which will be executed when object will go for garbage collection.<br>
There can be multiple constructor but there can be only one destructor .


* Q3. What is garbage collection ?.
>> Ans: Removing the object is deallocating from the memory .It is done manually in c using free() . In java manual thing is not required . It is done automatically in java using garbage collector.<br>
Java collector is a daemon thread

* Q4 . How java collector knows , the  objects needs to be removed .?
>> Concept is deference( or the object that is in memory but not in reference ) ,it will be freed 
Example ob=new Examle()
ob=null;
here ob is set to null and it is not referred by any other variable , so it will be garbage collected.

* Q5 . What is dispose technique ?
Ans :


Access Modifier

              |public			  | Protected				|	Default		|	Private
|---              |---						|---	    	|---
|class					Yes						No				Yes				No
|Inner Class				Yes						Yes				Yes				Yes
|Method					Yes						Yes				Yes				Yes
|Instance
 Variable				Yes						Yes				Yes				Yes
|Class 
 Variable				Yes						Yes				Yes				Yes	
|Local 
Variable				No 						No				No				No	
|Interface				Yes						No				Yes				No
Abstract
|Class					Yes						No				Yes				No	
|Constructor 			Yes						Check			Yes				Yes
|Destructor				Yes						No				No				No

Access table:
public				Protected			Default		Private
Within class			Yes					Yes					Yes				Yes
Outside 				Yes					Yes					Yes				No
the class
within same
package	
Outside the 			Yes					No					No				No
package
Outside the			    Yes					Yes					No				No
package 
after
inheritanc
