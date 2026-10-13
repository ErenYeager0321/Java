package Static_2Variable;

public class IMP_Variable {
	/*
	*What is a Static Variable?
	In Java, a static variable is a variable that belongs to the class rather than to
	instances of the class.
	
	//*when to use -  when the variable value is common for all the objects(void) of the class
	
	*1. you choose static for a method
	in order to call the method without creating object
	
	Problem: you need to access instance variable in
	static method.
	
	instance variable will be created at the time
	obj creation
	
	solution:
	to access instance variable in static method
	1st create object and then call static method
	
	** But still we cant call non static variable inside static method or block
	*  NON SONSE SOLUTION WHICH IS VIOLATING THE PRIMARY USE OF SATIC METHOD
	
	
	                             Variables(2types)
                 Primiriive                           Non premitive
                           p and Non p are of 3 types
               static                instance               local

	
	
	
	**Static                            
	.inside the
	.class outside
	.method
	.declared using static
	1.when class
	loaded
	2. inside static
	Segment
	3. initialized to
	default by JVM
	
	**instance
	↓
	inside the
	class outside
	method
	declared
	without
	using static
	1.when obj is
	created
	2. inside heap
	inside instance(obj)
	3.initialised to
	default
	
	**local
	inside the
	method/block
	1.when the method is
	called
	2.inside the stack
	inside Stack frame/activation
	record
	3. will not be
	initialized to default
	
	
	*/
}
