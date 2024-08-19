package DesignPatterns.Factory;

public class WebDeveloper implements Employee{

	public int salary() {
		System.out.println("Getting WebDeveloper salary");
		return 40000;
	}

}
