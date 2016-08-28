1A):
	

	Local variable
    1)is declared inside a method,constructor.
    2)must be initialized before use, otherwise it won't compile.
	3)Access modifiers cannot be used for local variables.

	Instance variable
    1)is declared inside a class.
    2)Initialization is not compulsory: if omitted, it contains default 		value (0, 0.0, false, null, etc.)
	3)Access modifiers can be used,visible for all methods.

	Static variable
	1)Declared with static keyword,inside class.
	2)Basically used to give constant values. Also only copy of static 			variable is made for a class,irrespective of the number of objects.
	3) Accessed by calling with the class name , eg: ClassName.VariableName


1B):

	Java
	
	1)Java does not support pointers, templates, unions, operator 				overloading, structures etc. it supports references..
	2)Java support automatic garbage collection.
	3)Java is interpreted for the most part and hence platform independent. 

	C++

	1)C++ supports structures, unions, templates, operator overloading, 		pointers and pointer arithmetic.
	2)C++ support destructors, which is automatically invoked when the 			object is destroyed.
	3)C++ generates object code and the same code may not run on different 		platforms.  


2A):

	this() is a reference variable that refers to the current object. It 		can be used to
		1)refer current class instance variable.
		2)invoke current class constructor.
		3)this can be passed as an argument in the method/constructor call.

2B):
	
	Because this refers to the object instance.
	There is no object instance in a call of a 	static method.

			
3A):

	Syntax : for(data_type variable : array | collection){} .
	It is mainly used to traverse array or collection elements.
	The advantage of for-each loop is that it eliminates the possibility of 	bugs and makes the code more readable.
	It is faster than the normal for loop

3B):


4A):
	It is a method that is used to initialize the object.
	It is invoked at the time of object creation. 
	It has same name as class name and no explicit return type.

	Default Constructor , Syntax: class_name(){} 
		It provides the default values to the object.

	Parameterized Constructor , Syntax: class_name(params){initiliaztion}//Refer Code
	It provides different values to distinct objects.

	Copy Constructor, Syntax: class_name(class_name object){} //Refer code
		Used for creating a duplicates of objects

											4B):

