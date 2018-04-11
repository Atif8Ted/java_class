### Important

* Q1. What is constructor . What is the purpose ?
>> Ams:
* Q2. What is destructor . And it,s purpose ?
>> Ams:
* Q3. What is garbage collection ?.
>> Ans: Removing the object is deallocating from the memory .It is done manually in c using free() . In java manual thing is not required . It is done automatically in java using garbage collector.<br>
Java collector is a daemon thread

* Q4 . How java collector knows , the  objects needs to be removed .?
>> Concept is deference( or the object that is in memory but not in reference ) ,it will be freed 
Example ob=new Examle()
ob=null;
here ob is set to null and it is not referred by any other variable , so it will be garbage collected.
