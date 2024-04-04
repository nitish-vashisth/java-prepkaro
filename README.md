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

## Multithreading and Synchronization

	
		Thread
			Locks
		Thread Pool
			Executor
			Callable
			Future
			Difference between Executor, ExecutorService and Executers class in Java
				Read more: https://javarevisited.blogspot.com/2017/02/difference-between-executor-executorservice-and-executors-in-java.html#ixzz7tnRaZlC1
		Synchronization	

		What is memory leak
		how GC works

  ## Exception Handling

  ### Collections

|Operation| List        | LinkedList  | ArrayList | Stack | Queue | HashSet | HashMap  |
|---------| ----------- | ------------|- ----------|-------|-------|---------|---------|
| Add     |             |             | 	   | 	   | 	   |         |         |


  		HashMap vs HashTable vs Concurrent HashMap
		
		Difference between ConcurrentHashMap, Hashtable and Synchronized Map in Java
			Read more: https://javarevisited.blogspot.com/2011/04/difference-between-concurrenthashmap.html#ixzz64t0kSwqV

			HashTable is legacy code and do not use it

	Comparable / Comparator -> How they works

### Java 8

		1. Lambda functions
		2. Functional Interface
			The major benefit of java 8 functional interfaces is that we can use lambda expressions to instantiate them and avoid using bulky anonymous class implementation.

		Java Stream api
		(argunement) -> expression
		Runnable r1 = () -> System.out.println("mu runnable");
### MISC 

		Servlet
	Servlet Container

	Java memeory allocation
		https://www.guru99.com/java-stack-heap.html
		https://www.baeldung.com/java-stack-heap
		https://dzone.com/articles/stack-vs-heap-understanding-java-memory-allocation
	
	Interface vs Abstract class
		Can we fields and methods

## Advance Java Concepts  

	1. Java Garbage Collection ?
	2. Creating a memory leak with Java
	3. What are Initialization Blocks? Static Initializer vs Instance Initializer
	4. Questions on Collection FrameWok ? Read All from Java Docs 
		--> Which collections are thread Safe,  will they maintain order, inital size. How to make collection threadSafe
	5. How hashmap works? hashset, its internal working and its complexity ? Something about RedBlack Tree
	6. What is initial capacity of Java Collection? Default size, size after resizing, how its done, underlying algo and ds of collection
	7. What is load factor?
	8. Explain about streams with an example? (Read it again)
	9. Generics ?
	10. Exception Handling ? try , catch , finally
	11. Does finally always execute in Java?
		Yes, finally will be called. The only times finally won't be called are:
			If you call System.exit()
			If the JVM crashes first
			If there is an infinite loop in the try block
			If the power turns off
	12. Explain the hierarchy of Exception related classes in Java?	
	13. Files in java
		FileReader vs FileWriter
		BufferedWriter and BufferedReader classes in Java
		PrintWriter
	14. Serialization
	15. Java Multithreading
	16. Monitors
		http://www.programcreek.com/2011/12/monitors-java-synchronization-mechanism/
	17. Write java code that causes deadlock ? (Refer JavaTpoint) 			
	18. What is the difference between synchronized and concurrent collections in Java?
		http://javarevisited.blogspot.in/2016/05/what-is-difference-between-synchronized.html
	19. Difference between Runnable and Thread in Java
		https://javarevisited.blogspot.com/2012/01/difference-thread-vs-runnable-interface.html
	20. Difference between Abstract class vs Interface in Java
		Read more: http://javarevisited.blogspot.com/2013/05/difference-between-abstract-class-vs-interface-java-when-prefer-over-design-oops.html#ixzz4o96GFcEF
	21. How clone works in Java ?
	21. Difference between Singleton Pattern vs Static Class in Java
	    Read more: http://javarevisited.blogspot.com/2013/03/difference-between-singleton-pattern-vs-static-class-java.html#ixzz4o96OTGuT	

## Java need to Know stuffs

	1. Java Collections(Official Java Docs)
		https://docs.oracle.com/javase/tutorial/collections/index.html
	
	2. How hashmap works in java
	 	http://howtodoinjava.com/core-java/collections/how-hashmap-works-in-java/
	
		http://javarevisited.blogspot.in/2011/02/how-hashmap-works-in-java.html
	
		Load Factor
		https://www.quora.com/Whats-the-purpose-of-load-factor-in-hash-tables
	
	3. Working with hashCode and equals methods in java
		http://howtodoinjava.com/core-java/basics/working-with-hashcode-and-equals-methods-in-java/
	
	4 . Performance Comparison of Different Ways to Iterate over HashMap
		http://howtodoinjava.com/core-java/related-concepts/performance-comparison-of-different-ways-to-iterate-over-hashmap/
	
	5 . A Beautiful Race Condition (Regarding hashmap resizing problem)
		http://mailinator.blogspot.in/2009/06/beautiful-race-condition.html
	
	6. JVM Architecture
	
		https://dzone.com/articles/jvm-architecture-explained
	
	7. Java Memory Managemnet Model
	
		http://www.journaldev.com/2856/java-jvm-memory-model-memory-management-in-java
	
		http://www.journaldev.com/4098/java-heap-space-vs-stack-memory
	
	For Garbage Collection
		http://javarevisited.blogspot.in/2011/04/garbage-collection-in-java.html#ixzz3PdfMHrCs
	
	6 . How System.out.println() works ? 
	
	7. Is java compiled or interpreted ?
	
	8. Why multiple inheritance is not supported in java?(Source javaTpoint)
	
		To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
		Consider a scenario where A, B and C are three classes. The C class inherits A and B classes. If A and B classes have same method and you call it from child class object, there will be ambiguity to call method of A or B class.
		Since compile time errors are better than runtime errors, java renders compile time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error now.
	
	9. What is goto . Is there goto in java ?
	
	10. What is final in Java? Final variable , Method and Class Example ? why would someone make  a class final ?
		Read more: http://javarevisited.blogspot.com/2011/12/final-variable-method-class-java.html#ixzz4njCZt0EN
	
	11. Why String is Immutable or Final in Java
		Read more: http://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html#ixzz4njFpcLgs
	
	12. Java String Interview Questions and Answers
		http://javarevisited.blogspot.com/2012/10/10-java-string-interview-question-answers-top.html
	
	13. What is Static Variable Class method and keyword in Java - Example Tutorial
		Read more: http://javarevisited.blogspot.com/2011/11/static-keyword-method-variable-java.html#ixzz4njGT9Ixr
	
	14. 10 Singleton Pattern Interview Questions in Java - Answered
		Read more: http://javarevisited.blogspot.com/2011/03/10-interview-questions-on-singleton.html#ixzz4njKQ6Zdy
	
	15. Top 10 Java String interview Question answers - Advanced
		Read more: http://javarevisited.blogspot.com/2012/10/10-java-string-interview-question-answers-top.html#ixzz4njKXEIc6			
	
	16. How SubString method works in Java - Memory Leak Fixed in JDK 1.7
		Read more: http://javarevisited.blogspot.com/2011/10/how-substring-in-java-works.html#ixzz4njKeeriv
	
	17. When a class is loaded and initialized in JVM - Java
		Read more: http://javarevisited.blogspot.com/2012/07/when-class-loading-initialization-java-example.html#ixzz4njKjM5Nk
	
	18. How StringBuilder works internally? (asked to freeze)
		https://stackoverflow.com/questions/8011338/how-is-stringbuffer-implementing-append-function-without-creating-two-objects
		http://vixmemon.blogspot.in/2010/04/how-stringbuilder-works-internally.html	
	
	20. 10 points about Java Heap Space or Java Heap Memory
		Read more: http://javarevisited.blogspot.com/2011/05/java-heap-space-memory-size-jvm.html#ixzz4njKK3JNJ
	
	21. Double Checked Locking on Singleton Class in Java
		Read more: http://javarevisited.blogspot.com/2014/05/double-checked-locking-on-singleton-in-java.html#ixzz4ogP6lIqJ	
	
	22. How Volatile in Java works? Example of volatile keyword in Java
		Read more: http://javarevisited.blogspot.com/2011/06/volatile-keyword-java-example-tutorial.html#ixzz4ogRfhpyj	
	
	23. What is Factory method Design Pattern in Java with Example - Tutorial
		Read more: http://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html#ixzz4ogUZsmPj	
	
	24. Observer Design Pattern
		https://dzone.com/articles/design-patterns-uncovered	
	
	    https://techienotes.info/2015/09/16/observer-pattern-explained-with-java-example/
	
	24. In Java threading, what is the difference between "implements Runnable" and "extends Thread"?
		https://www.quora.com/In-Java-threading-what-is-the-difference-between-implements-Runnable-and-extends-Thread

 ## Miscellaneous

	 OpenJDK vs Oracle JDK
		
		Practical Data Structure, Algorithm, and Design Interview Questions from Investment Banks - Java
			Read more: http://javarevisited.blogspot.com/2017/03/2-practical-data-structure-algorithm-interview-questions-java.html#ixzz4o2LNvJeI	
	
		What is purpose of different HTTP Request Types in RESTful Web Service?
			Read more: http://javarevisited.blogspot.com/search/label/interview%20questions?updated-max=2017-03-20T05:34:00-07:00&max-results=6#ixzz4o2LdkFan
	
		Get / Post / Put / Delete (when to use which)	
	
		Aggregation implies a relationship where the child can exist independently of the parent. Example: Class (parent) and Student (child). Delete the 	Class and the Students still exist.
	
		Composition implies a relationship where the child cannot exist independent of the parent. Example: House (parent) and Room (child). Rooms don't 	exist separate to a House.
	
			The above two are forms of containment (hence the parent-child relationships).
	
		Dependency is a weaker form of relationship and in code terms indicates that a class uses another by parameter or return type.
	
		Dependency is a form of association.
	
	
		http://www.geeksforgeeks.org/serialization-in-java/
		http://www.geeksforgeeks.org/producer-consumer-solution-using-threads-java/
		http://www.geeksforgeeks.org/multithreading-in-java/
		http://www.geeksforgeeks.org/synchronized-in-java/
		http://www.geeksforgeeks.org/inter-thread-communication-java/
		http://www.javainterview.in/p/core-java-interview-question-are.html
	
		how null is implemented in java
		SQL injection

  		Transient keyWord in java

## Handy Java Syntax

		int[] num = new int[10];
		
		Arrays.sort(num);
		Arrays.sort(si, ei, num);
		
		HashSet<Character> hs = new HashSet<Character>();
		
		
		
		
		1. Taking Input using BufferedReader
		
		import java.util.*;
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
		
		public class Solution{
		
		    // Here do not forget to write throws Exception if using BufferedReader
		    public static void main(String[] args)throws Exception {
		
		       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        String line = br.readLine();
		        int N = Integer.parseInt(line);
		        
		        //int[] brr = new int[2];
		        
		        for(int i=0;i<N;i++){
		
		            line = br.readLine();
		            
		            // Split function for spltting input
		            String[] arr = line.split(" ");
		            
		            int a = Integer.parseInt(arr[0]);
		            int b = Integer.parseInt(arr[1]);
		            int c = a+b;
		            
		            System.out.println(c);
		
		        }
		    }
		}
		
		
		
		2. Using StringBuilder
		
		// This shows how StringBUilder Works in java
		// StringBuilder Vs StringBUffers (They are use to create mutable string.)
		
		/*
		StringBuffer is the thread safe utility class to perform several operations on Strings. 
		It contains append() and insert() methods that are widely used to perform operation 
		on Strings in a multi-thread environment. Most of its functions are synchronized for thread safety.
		
		Since most of the String operations, for example concatenation happens in a single thread environment, 
		Java 1.5 introduced another utility class StringBuilder to perform similar operations but doesn’t provide 
		thread safety. All the methods are unsynchronized.
		
		*/
		
		
		import java.util.*;
		import java.io.*;
		
		class Test{
		
		public static void main(String args[]){  
		
		
		            StringBuilder fin = new StringBuilder();
		        
		            String fn = "Nitish";
		            String ln = "Vashisth";
		
		             /// Using string builder
		             StringBuilder bru = new StringBuilder(fn);
		
		             /// Using reverse Method directlty , insead of writing function for same
		             bru.reverse();
		             
		             /// Using append method
		             bru.append(" test \n");
		             bru.append(ln);
		            
		            /// Back to string
		            String total = bru.toString();
		
		            System.out.println(" Final string is : " + total);
		
		            /// Split other than whitespace
		
		            String s = "hell.tea.kit.ll";
		
		            String[] arr = s.split("\\.");
		
		            for(int i=0;i<arr.length;i++){
		                   System.out.println(arr[i]);
		            }
		
		 }  
		}  
		
		Output :
		hsitiN test Vashisth
		
		
		
		3. Using Lambda Expressions
		
		import java.util.*;
		import java.io.*;
		
		  class Node{
		    
		    int val;
		    int count;
		
		    Node(int v , int c){
		        val = v;
		        count = c;
		    }
		  }  
		
		class Test{
		
		public static void main(String args[]){  
		
					ArrayList<Node> al = new ArrayList<Node>();
		
					al.add(new Node(11,2));
					al.add(new Node(9,2));
					al.add(new Node(10,2));
					al.add(new Node(9,3));
		
					/// Here we have made comparion based on more 
					///	than one variable
		
					al.sort((Node n1,Node n2)->{
		
							if(n1.val==n2.val){
								return n2.count-n1.count;
							}
							return n1.val-n2.val;
					
					});
		
					al.forEach(p->System.out.println(p.val + " " +p.count));
		
		 }  
		}  
		
		output : 
		9 3
		9 2
		10 2
		11 2
		
		
		*************************************************
		*                                               *
		*  3. Overriding equals and hashcode method     *
		*                                               *
		*************************************************
		
		//// This is how to make a custom set
		///  For entries of type Object like Student
		
		import java.util.*;
		import java.io.*;
		
		class Student{
		
			int age;
			String name;
		
			Student(int age , String name){
				this.name=name;
				this.age=age;
			}
		
			public boolean equals(Object obj) {
		    if (this == obj)
		        return true;
		    if (obj == null)
		        return false;
		    if (getClass() != obj.getClass())
		        return false;
		
		    Student s = (Student) obj;
		    
		    if (this.age != s.age)
		        return false;
		    if (this.name.compareTo(s.name)!=0)
		        return false;
		    return true;
		}
		
		
			public int hashCode(){
				return Objects.hash(age,name);
			}
		}
		
		class Test{
		
		public static void main(String args[]){  
				
				HashSet<Student> hs = new HashSet<Student>();
		
				Student s1 = new Student(1,"ramu");
				Student s2 = new Student(2,"sita");
				Student s3 = new Student(3,"ramu");
		
				hs.forEach((Student p)->System.out.println(p.age + "  " + p.name + p.hashCode()));
		 }  
		} 
		
		
		
		
		*********************************
		*                               *
		*  4.  Custom Priority Queue    *
		*                               *
		*********************************
		
		    PriorityQueue<Node> p  = new PriorityQueue<Node>(new Comparator<Node>(){
		                        
		          public int compare(Node n1,Node n2){
		                return n2.count-n1.count;
		                  }
		          });
		
		    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b)
		
		    By Default priority queue is min heap
		
		    ;
		
		*********************************
		*                               *
		*     Other handy Syntax        *
		*                               *
		*********************************
		
		1. String to char Array
				
				String s = "HelloWorld";
				char[] ch = s.toCharArray();
		
		2. Back to string (char Array to string)
				
				String k = new String(ch);
		
		3. 			
		       String s = "hell.tea.kit.ll";
		
		       String[] arr = s.split("\\.");
		
		       for(int i=0;i<arr.length;i++){
		
		        System.out.println(arr[i]);
		       }
			
		
		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		
		1.Counting bit in an Integer number
		
		  int bitcount = Integer.bitCount(num);
		
		2. Using Comparable(compareTo) and Comparator(compare)
		
		Ascii value range
		
		  
		Actual value Ascii value
		0-9  48-57
		A-Z 65-90
		a-z 97-122
		
		
		4. Getting ascii value
		  
		  char p = 'A';
		  int ascii = p;
		
		           or
		
		  int ascii = (int)ch;
		
		5. Getting actual value from ascii value
		
		      int num = 67;
		  	  char ascii =(char)num; 
		
		6. Convert String of number to integer
		
		    String s = "1234";
		    int ee = Integer.parseInt(s);
		    System.out.println(ee);
		    
		7. Integer.toBinaryString(int n)
		  
		    Returns string of binary representation of number n
		
		8.String split : Below is example based on white spaces
		
		  String org = "Today is beautiful day";
		    String[] sp = org.split(" "); 
		    for(String a:sp)
		      System.out.println(a);
		
		9.BufferedReader/Writer instead of Scanner makes I/O  fast.
		
		10. BigInteger as bignum class.
		
		PriorityQueue for multi-field sorting problems and algorithms.
		
		
		http://www.practice.geeksforgeeks.org/problem-page.php?pid=1304
		Minimize string value
		
		
		11. For sorting arryas
		  
		Arrays.sort(al);              // in java.util package
		Collections.sort();     
		
		
		
		Interview questions:
		
		Q How java Handles divide by zero :
		
		
		Collections.sort(al.subList(i,a.size()));
		
		  Arrays.sort(bArr, 1, 4);   4 exclusive
		
		
		14 Integer.MIN_VALUE
		15 Intgere.MAX_VALUE
		16 Math.max(a,b)
		17 Math.min(a,b)
		18 Math.abs(num)
		19 String.valueOf(num)
		20 s.contains(s2)
		21 s.indexOf(s2)
		22 Character.toString(char)
		
		
		*** Lambda Expressions
		
		al.sort((Student s1,Student s2)->s1.age-s2.age);
		al.sort((Student s1,Student s2)->s1.name.compareTo(s2));
		
		al.forEach( stud -> System.out.println(stud.name + " " + stud.age) );
		
		Map
		=====
		
		hm.forEach((k,v)->System.out.println(k,v));
		hm.forEach((k,v)->{Staements});
		
		PriorityQueue<> pq = new PriorityQueue((x,y)->y-x);
		
		
		Collections.reverse()
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine()
		Integer.parseInt()
		line.split(" ");
		line.split("\\.");
		
		StringBuilder vs StringBuffer
		StringBuilder bru  = new StringBuilder
		bru.reverse()
		bru.append("test \n");
		bru.toString();
		s.toCharArray();
		s.length
		Integer.bitCount();
		
		
		Arrays.sort(al);
		Collection.sort();
		Collection.reverse
		
		default is min heap
		PriorityQueue<Node> p = new PriorityQueue<Node>((x,y)->y-x);
		
		Integer.MIN_VALUE
		Integer.MAX_VALUE
		Math.max()
		Math.min()
		Math.abs()
		String.valueOf(num)
		s1.contains(s2)
		s1.indexOf(s2)
		Charater.toString(char)
  
## References

	1. Tutorial Point / JavaTpoint
	2. Document - In28minutesCourses
	3. Below questions 
		--> Basic Java Concepts
		--> Advance Java Concepts
		--> Java need to Know stuffs
		--> Miscellaneous
	4. Features of Java 8 -> must read for experience level interview
		Links 
			--> https://howtodoinjava.com/java-8-tutorial/
			--> https://www.journaldev.com/2389/java-8-features-with-examples
			--> https://www.geeksforgeeks.org/functional-interfaces-java/
			--> https://www.geeksforgeeks.org/stream-in-java/
			--> https://dzone.com/articles/how-to-use-map-filter-collect-of-stream-in-java-8
	
	Books :-
		Head First Java
		Head First Design pattern
