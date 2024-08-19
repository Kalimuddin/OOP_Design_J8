package DesignPatterns.Singleton;

public class Singleton {

	public static void main(String[] args) {
		//Singleton :
		Samosa samosa1 = Samosa.getSamosa();
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		System.out.println(samosa2.hashCode());
	}

}
