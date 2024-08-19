class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}


public class GenericsExample {
	public static void main(String args[]) {
		// Instance of integer type:
		Test<Integer> obj1 = new Test<>(10);
		System.out.println(obj1.getObject());
		
		obj1.obj = 20;
		//obj1.obj = "20";
		System.out.println(obj1.getObject());
		
		// Instance of String type:
		Test<String> obj2 = new Test<>("Kalim");
		System.out.println(obj2.getObject());
		System.out.println(obj2.getObject().contains("Kal"));
		
		//Using object: problem is we have to typecast
		Object obj3 = new Object();
		obj3 = 50;
		//System.out.println(obj3/10);
		Object obj4 = new Object();
		obj4 = "KalimBhai";
		//obj4.contains();
	}
}
