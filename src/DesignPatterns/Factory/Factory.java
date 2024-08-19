package DesignPatterns.Factory;

public class Factory {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Android Developer");
		int salary = employee.salary();
		System.out.println("Salary : " + salary);
		
		Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
		int salary2 = employee2.salary();
		System.out.println("Salary : " + salary2);
	}

}
