class Shape{
	public void area() {
		System.out.println("Displays area of Shape");
	}
}

// Single Level Inheritance :-
class Triangle extends Shape{
	public void area() {
		System.out.println("Displays area of Shape of Triangle");
	}
	public void area(int b, int h) {
		System.out.println((float)1/2*b*h);
	}
}

// MultiLevel Inheritance :-
class EquilateralTriangle extends Triangle{
	public void area(int b, int h) {
		System.out.println((float)1/2*b*h);
	}
}

// Hierarchical Inheritance :- (Bothe Circle and Triangle are inherited from Shape class)
class Circle extends Shape{
	public void area(int r) {
		System.out.println(3.14*r*r);
	}
}

// Hybrid inheritance :- It is a combination of Single Level, MultiLevel and Hierarchical inheritance. 

// Multiple inheritance :- There is no Multiple inheritance in JAVA in the form of classes because of ambiguity, 
                        // So we use Interfaces for the implementation of Multiple inheritance
// Real life eg : Vehicle Hierarchy, Employee Hierarchy

// Multiple inheritance because : when a class inherits from two classes that have a common ancestor, If both parent classes have a method with the same name, 
// there is ambiguity about which method implementation should be inherited by the child class.
//class MI extends Shape, Triangle {

//}

public class Inheritance {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		t1.area();
		t1.area(6, 8);
		
		EquilateralTriangle t2 = new EquilateralTriangle();
		t2.area();
		t2.area(10,20);
		
		Circle c1 = new Circle();
		c1.area();
		c1.area(10);
	}

}
