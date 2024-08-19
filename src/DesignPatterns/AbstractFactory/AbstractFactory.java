package DesignPatterns.AbstractFactory;

public class AbstractFactory {

	public static void main(String[] args) {
		// i want to get Android Developer
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		e1.name();
		// i want to get Web Developer
		Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
		e2.name();

	}

}
