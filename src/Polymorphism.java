/* Types of Polymorphism :
   1. Compile Time Polymorphism (Static) : Method Overloading
   2. Runtime Polymorphism (Dynamic) : Method Overriding*/
// operator overloading is not possible in java 

class StudentC{
	String name;
	int age;
	
	// Compile Time :-
	public void printInfo(String nam) {
		System.out.println(nam);
	}
	public void printInfo(int ag) {
		System.out.println(ag);
	}
	public void printInfo(String nam, int ag) {
		System.out.println(nam + " " + ag);
	}
	// we can create class ststic if it is nested class
	static class Tmp{
		
	}
	// static block executed once when it is loaded before the main method
	static {
		
	}
}

// Run Time :- If subclass (child class) has the same method as declared in the parent class, it is known as method overriding.
// Rules for Java Method Overriding : 
// 1. The method must have the same name as in the parent class
// 2. The method must have the same parameter as in the parent class.
// 3. There must be an IS-A relationship (inheritance).

class Vehicle{
	int temp = 10;
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	int temp = 20;
	public void run() {
		System.out.println("Bike is running");  // it has some specific implementation of run() method from above parent class. (that is why we use method overriding)
	}
}

//Real life eg : Shape Class (circle, triangle, etc) : calculateArea() , Music or video Player : play()

public class Polymorphism {
	public static void main(String args[]) {
		// Compile Time : 
		StudentC s1 = new StudentC();
		s1.name = "Kalimuddin";
		s1.age = 24;
		s1.printInfo(s1.age);
		s1.printInfo(s1.name);
		s1.printInfo(s1.name, s1.age);
		
		// Run Time :
		Bike b = new Bike();
		b.run();
		
		Vehicle v1 = new Vehicle();
		System.out.println(v1.temp);
		
		Vehicle v2 = new Bike();
		System.out.println(v2.temp);
		
		Bike b1 = new Bike();
		System.out.println(b1.temp);
		//Bike b2 = new Vehicle();
	}

}
