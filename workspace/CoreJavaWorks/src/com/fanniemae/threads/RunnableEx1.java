package com.fanniemae.threads;


class ThirdPartyBusiness {
	public void discount(){
		System.out.println("discount");
	}
}

class MyBusiness extends ThirdPartyBusiness implements Runnable{
	
	Thread t;
	
	MyBusiness(String name, int priority){
		t = new Thread(this, name);
		t.setPriority(priority);
		t.start();
	}

	public void run(){
		for(int i=0; i<=500; i++){
			this.discount();
			System.out.println("I value "+ i + "in Thread " + Thread.currentThread().getName());
		}
		System.out.println("Thread " +Thread.currentThread().getName()+ " exiting");
	}
	
	
}
public class RunnableEx1 {
	
	public static void main(String args[]){
		MyBusiness m1 = new MyBusiness("Electronics", Thread.MAX_PRIORITY);
		MyBusiness m2 = new MyBusiness("Juice", Thread.NORM_PRIORITY);
		MyBusiness m3 = new MyBusiness("Tofu", Thread.MIN_PRIORITY);
		
	}
	
	

}
