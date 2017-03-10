package com.fanniemae.interfaces;

public class HomeLoan implements Loan {

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
		System.out.println("submitted");
		
	}

	@Override
	public void loanAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("loanAmount" + " "+amount);
		
	}

	@Override
	public void foreClosure() {
		// TODO Auto-generated method stub
		
		System.out.println("foreclosed");
		
	}

	@Override
	public void foreClosure(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("foreclosed amount " + amount);
		
	}
	
	public static void main(String[] args){
		Loan ln = new HomeLoan();
		
		ln.foreClosure(1000);
		ln.submit();
	}

}
