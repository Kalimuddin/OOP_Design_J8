package Java8FeaturesThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface A{
	void show();
	//void show2();  // In FunctionalInterface(SAM), there is only one abstract method
	// A functional interface can have any number of default methods.
	default void showDetails() {
		System.out.println("showing details");
	}
}

//Default methods:we can add new functionality to existing interfaces (add methods with implementation by using default keyword).
//In particular, default methods enable you to add methods that accept lambda expressions as parameters to existing interfaces.
interface D{
	void walk();
	default void eat() {
		System.out.println("eating");
	}
}

// Before Java8 we implement Functional interface like below two methods : Class B annd Anonymous class :
class B implements A{
	public void show() {
		System.out.println("in showB");
	}
}

//(Anonymous inner class : don't need to create extra class for implemention of show() method)
//From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface
// lanbda expression used only with functional interface.
public class Java8 {
	public static void main(String args[]) {		
		// Anonymous inner class :
		A obj = new A()
		{
			public void show()
			{
				System.out.println("in show A");
			}
		};
		
		// Lambda expression: it simplify the anonymous inner class
		A objLE = () -> System.out.println("showing Lambda");

		A obj2 = new B(); // of Normal class
		//B objectB = new A(); not possible
		obj2.show();
		
		obj.show();
		obj.showDetails();
		objLE.show();
		
		//forEach() method
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
		System.out.println(arr);
		arr.forEach(n -> System.out.println(n*2));
		
		//Stream in java : Each stream can only be used once (terminal operation or reduction operation):
		// After a terminal operation called on a Stream, you cannot perform any more operations on the same Stream
		
//		Stream<Integer> s1 = arr.stream();
//		//s1.forEach(n -> System.out.println(n));
//		Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//		//s2.forEach(n -> System.out.println(n));
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		//s3.forEach(n -> System.out.println(n));
//		int res = s3.reduce(0, (a,b) -> a+b);
		
		// example of lambda expression (as Stream is functional interface also)
		int res = arr.stream().
				filter(n -> n%2==0).
				map(n -> n*2).
				reduce(0, (a,b) -> a+b);
		System.out.println(res);
		
		//List number = Arrays.asList(2,3,4,5,3);
		//Set square = number.stream().map(x -> x*x).collect(Collectors.toSet()); 
		
		//Primitive Stream : IntStream, LongStream, DoubleStream
		int a[] = {2,4,5,6,2};
		IntStream intStream = Arrays.stream(a);  
		
		// Parallel Stream :
		System.out.println("Available Cores : " + Runtime.getRuntime().availableProcessors());
		List<String> lst = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V");
		//System.out.println(Thread.currentThread().getName());
		//lst.parallelStream().forEach(System.out::print);
		lst.stream().forEach(x -> System.out.println(x + Thread.currentThread().getName()));
		//lst.parallelStream().forEach(x -> System.out.println(x + Thread.currentThread().getName()));
	}
}
