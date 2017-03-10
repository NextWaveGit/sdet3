package com.fanniemae.threads;

class BusinessLogic extends Thread{
	public void run(){
		for(int i=0; i<=500; i++){
			System.out.println("I value "+ i + "in Thread " + Thread.currentThread().getName());
		}
		System.out.println("Thread " +currentThread().getName()+ " exiting");
	}
}


	public class ThreadEx1 {

		public static void main(String args[]){

			System.out.println("Name: "+ Thread.currentThread().getName());
			System.out.println("Priority " + Thread.currentThread().getPriority());
			
			BusinessLogic bl = new BusinessLogic();
			bl.setName("Vinay");
			bl.setPriority(3);
			bl.start();
			
			BusinessLogic b2 = new BusinessLogic();
			b2.setName("Edmund");
			b2.setPriority(10);
			b2.start();

			for(int i=0; i<=500; i++){
				System.out.println("I value "+ i + "in Thread " + Thread.currentThread().getName());
			}
			
			try {
				bl.join();
				b2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("main Thread  exiting");
		}
	}
