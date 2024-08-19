interface Animls{
	int legs = 4;
	int mouth = 1;
	void details();
	
}

interface Hrse{
	void type();
}

class C implements Animls, Hrse {
	public void details() {
		System.out.println("showing details");
	}
	public void type() {
		System.out.println("typehorse");
	}
}

public class kalim{
	public static void main(String args[]) {
		C c = new C();
		System.out.println(c.legs);
		c.type();
	}
}