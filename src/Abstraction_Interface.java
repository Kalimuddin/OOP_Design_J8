
/* Interface : The interface in Java is a mechanism to achieve abstraction and multiple inheritance. 
   There can be only abstract methods in the Java interface, not the method body. 
   In other words, interfaces can have abstract methods and variables, it cannot have a method body.
   
   - All the fields in interfaces are public, static, final and abstract by default.
   - A class that implements an interface must implement all the methods declared in the interface.

 */

interface Animals{
	int eyes = 2;
	void walk();    // in interface, all the fields are public, static, final and abstract by default
	
	default void run() {
		System.out.println("running on 4 legs of Animals");
	}
}

interface Herbivores{
	default void run() {
		System.out.println("running on 4 legs of Herbivores");
	}
	
}

interface A extends Animals{
	
}

// Multiple inheritance:-
class Horses implements Animals, Herbivores {
	public void walk() {
		System.out.println("walks on 4 legs");
	}

	// teling class which method with same name should be called from Animals or Herbivores
	@Override
	public void run() {
		Herbivores.super.run();
	}
}

public class Abstraction_Interface {
	public static void main(String args[]) {
		Horses horse1 = new Horses();
		horse1.walk();
		horse1.run();
		//What if there are two interface with same method name, After implementing both interface Which interface method will be exicute??
		// Answer in screenshots: create own functionality or have to tell which interface method should execute
	}
}
