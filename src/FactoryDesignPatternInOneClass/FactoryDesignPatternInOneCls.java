package FactoryDesignPatternInOneClass;

import java.util.Scanner;

interface ATM{
	void withdraw();
	void deposit();
}

class SBIAtm implements ATM{

	@Override
	public void withdraw() {
		
	}

	@Override
	public void deposit() {
		
	}
	
}

class PNBAtm implements ATM{

	@Override
	public void withdraw() {
		
	}

	@Override
	public void deposit() {
		
	}
	
}

class AtmFactory{
	public ATM getBankName (String bankName) {
		if(bankName.equalsIgnoreCase("SBI")) {
			return new SBIAtm();
		}
		else if(bankName.equalsIgnoreCase("PNB")) {
			return new PNBAtm();
		}
		else {
			return null;
		}
	}
}

public class FactoryDesignPatternInOneCls {
	public static void main(String args[]) {
		AtmFactory atmFactory = new AtmFactory();
		
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		input.close();
		
		ATM anATM = atmFactory.getBankName("input");  //input can be taken from card, which bank is card of?
		anATM.deposit();
	}
}
