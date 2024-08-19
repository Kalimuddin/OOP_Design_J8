class StudentB{
	String name;
	int age;
	
	public void getInfo() {
		System.out.println("Name of the student is " + this.name);
		System.out.println("Age of the " + this.name + " is " + this.age);
	}
	
	// Creating constructor :- special method that is used to initialized objects, it is called when an object of class is crated.
	StudentB(){
		
	}
	StudentB(String nam, int ag){
		this.name = nam;
		this.age = ag; 
	}
	StudentB(StudentB s){
		this.name = s.name;
		this.age = s.age;
	}
}

public class Constructor {
	public static void main(String args[]) {
		// For By default Constructor :-
		StudentB s1 = new StudentB();
		s1.name = "Kalim";
		s1.age = 24;
		s1.getInfo();
		
		// For Parameterized Constructor :-
		StudentB s2 = new StudentB("Sachin",23);
		s2.getInfo();
		
		// For Copy Constructor :-
		StudentB s3 = new StudentB(s2);
		s3.getInfo();
	}
}
