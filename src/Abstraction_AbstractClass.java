/* Abstraction : Data abstraction is the process of hiding certain details and 
                 showing only essential information to the user.
   
  Abstraction is achieved in 2 ways :
  1. Abstract class : In which one or more abstract method are present.
  2. Interfaces (Pure Abstraction) : is a group of related methods with empty body.
  
  - Abstract method are method which is only declared but their functionality or definition are not created.
  - we can not extend multiple abstract class but we can implement multiple Interfaces at a time.
  - A class can implement multiple interfaces and extend a class at the same time.
  
  - An abstract class must be declared with an abstract keyword.
  - It can have abstract and non-abstract methods.
  - It cannot be instantiated.
  - It can have constructors and static methods also.
  - It can have final methods which will force the subclass not to change the body of the method.

*/

// Real life eg : Car Dashboard, Smartphone Interface

/* we can not use or intantiate abstract class, actual object will created from Horse and chicken,
   not from Animals. (So, Data hiding concept comes into the picture for abstract Animal class)
*/
abstract class Animal{
	abstract void walk();
	public void eat() {
		System.out.println("Animal eats");
	}
	public Animal(){
		//abstract can also have constructor
	}
}

class Horse extends Animal{
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

class Chicken extends Animal{
	public void walk() {
		System.out.println("Walks on 2 legs");
	}
}


public class Abstraction_AbstractClass {
	public static void main(String args[]) {
		Horse horse1 = new Horse();
		horse1.walk();
		horse1.eat();
	}
}
