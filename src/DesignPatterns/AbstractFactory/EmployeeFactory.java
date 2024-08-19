package DesignPatterns.AbstractFactory;

public class EmployeeFactory {
	//get employee
	public static Employee getEmployee(EmployeeAbstarctFactory factory) {
		return factory.createEmployee();
	}
}
