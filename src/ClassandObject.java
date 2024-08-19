class Pen {
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

class StudentA { 
	String name;
	int age;
	
	public void getInfo() {
		System.out.println("Name of the student is " + this.name);
		System.out.println("Age of the " + this.name + " is " + this.age);
	}
}


// we create objects under main function and main comes under public class.
public class ClassandObject {
	public static void main(String args[]) {
		// For Pen :-
		Pen pen1 = new Pen();    // Here, Pen() is a Constructor (special method).
		pen1.color = "Blue";
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		
		pen1.printColor();
		pen2.printColor();
		
		
		// For Student :-
		StudentA s1 = new StudentA();   // Here, Student() is a Constructor (special method).
		s1.name = "Kalim";
		s1.age = 24;
		
		StudentA s2 = new StudentA();
		s2.name = "Shamsi";
		s2.age = 25;
		
		s1.getInfo();
		s2.getInfo();
	}
}
