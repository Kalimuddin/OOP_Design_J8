package DesignPatterns.Singleton;

// Singleton class
public class Samosa {
	private static Samosa samosa;
	//constructor
	private Samosa(){
		
	}
	
	//making static : this method is now associated with class, now we need class name to call this method)
	public static Samosa getSamosa() {
		//object of the class
		if(samosa==null) {
		samosa = new Samosa();
		}
		
		//if thread safety is concern:
//		if(samosa == null) {
//			synchronized(Samosa.class) {
//				if(samosa == null) {
//					samosa = new Samosa();
//				}
//			}
//		}
		
		return samosa;
	}
}
