// Access modifier in java helps to restrict the scope of a class, constructor, variable, method or data member.
// public > protected > default> private
/* There are four types of access modifier :
   1. default : can be access from anywhere only in same package, from other package can not access.
   2. public : can be accessed from anywhere.
   3. protected : can be access from anywhere in same package but from other packages only from subclass can be access.
   4. private : can be accessed only in same class,
      For accessing private things we use getters and setters concept.
      Means we are not directly accessing the private things instead we created extra functions for this.
*/

class Account{
	public String name;
	protected String email;
	private String password;
	
	// getters and setters :-
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String pswrd) {
		this.password = pswrd;
	}
	// we can can remove setter method so that it give more control, you can only get data but can not set
}


public class AccessModifiers {
	public static void main(String args[]) {
		Account account1 = new Account();
		account1.name = "Shamsi";
		account1.email = "kalim@gmail.com";
		
		// account1.password = "abcd123";
		account1.setPassword("abcd123");
		System.out.println(account1.getPassword());
		
		
		
	}
}
