# java-champion

- **Introduction**
  What is Java and histrory ?



## Introduction
#### Difference btn C,Java and C++?
#### Latest Java Verison and comparison of featutes from java 8 - 21 
#### what is goto? In C or Java? Why its not preferred ?
#### Platform Independence
#### What are the important differences between C++ and Java?
#### JVM Architercture

## Java OOPS concept
#### Object Oriendted Language( https://docs.oracle.com/javase/tutorial/java/concepts/interface.html )
### Object, Class, Inheritance, Polymorphism, Abstraction , Encapsulation
		What are wrapper classes?
		Casting ? Explicit vs Implicit
		How are variables initialialized in Java?
		What is an Enum ?
		Can super class reference variable can hold an object of sub class? (Yes)
		Is Multiple Inheritance allowed in Java? why ? ( NO)
		PolyMorphism ( Pet , animal example , Dog could be pet and animal both)
			https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
		Inteface vs Abstract class ? Which should you use, abstract classes or interfaces?	
			https://www.baeldung.com/java-interface-vs-abstract-class
			https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
		What is Coupling / Cohesion ?
		Encapsulation ? (Ex , cricket score)
		Method OverLoading / Overriding ?
		Inner Class ? Why Use Nested Classes?
			https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
		Constructors ? Super KeyWord	
		Is a super class constructor called even when there is no explicit call from a sub class constructor?( Yes , Compiler append Super)
		Interface ? An interface defines a contract for responsibilities (methods) of a class.
		Access Modifiers
		Final KeyWord
		What happens when a variable is marked as volatile?
		Transient Keyword in Java
		Static KeyWord 
		Where memory is allocated for refrence , objects , strings etc.
			https://stackoverflow.com/questions/13624462/where-does-class-object-reference-variable-get-stored-in-java-in-heap-or-stac
		Java  call by reference or call by value ?
		Can we declare a class Static in Java?
			Read more: https://javarevisited.blogspot.com/2017/04/can-we-declare-class-static-in-java.html#ixzz65SU81aiT
		What is the difference between aggregation, composition and dependency? 

		Can we override main method in java

	Object Class -> the super class of every class in Java
		equals() and hashCode() 

	## Java Strings
 	   		String constant pool , why strings are final
		toString() method ?
		Java Strings
		StringBuffer??Mutable vs Immutable!? String vs StringBuffer? Implementation , of append method , see how its implemeted in java
				// This shows how StringBUilder Works in java
			// StringBuilder Vs StringBuffers (They are use to create mutable string.)

			/*
			StringBuffer is the thread safe utility class to perform several operations on Strings. 
			It contains append() and insert() methods that are widely used to perform operation 
			on Strings in a multi-thread environment. Most of its functions are synchronized for thread safety.

			Since most of the String operations, for example concatenation happens in a single thread environment, 
			Java 1.5 introduced another utility class StringBuilder to perform similar operations but doesn’t provide 
			thread safety. All the methods are unsynchronized
		String Immutability
	   		http://mindprod.com/jgloss/immutable.html
		Where does Java's String constant pool live, the heap or the stack?
			https://stackoverflow.com/questions/4918399/where-does-javas-string-constant-pool-live-the-heap-or-the-stack


