	package com.fannie.inheritence;
	
	class A{
		A(){
			System.out.println("From A");
		}
		
		public void move(){
			System.out.println("all move");
		}
	}
	
	class B extends A{
		B(){
			super();
			System.out.println("From B");
		}
		
		public void steering(){
			System.out.println("steering");
		}
	}
	
	class C extends B{
		String model;
		
		
		C(){
			
			
			//super();
			System.out.println("From C");
			
		}
		
		//public void setMake(String fName) {
			//this.model = fName;
		//}
		
		public C(String model){
			this.model = model;
		}
		
		public String getModel(){
			return model;
		}
	
	}
	 
	public class InheEx {
		public static void main(String[] args){
			/*C objC=new C("BMW");
			//objC.setMake("BMW");
			System.out.println(objC.getModel());
			objC.steering();
			objC.move();
			*/
			A[] as =new A[5];
			as[0]= new C("toyota");
			as[0].move();
			//C c=(C)as[0];
			if(as[0] instanceof C) {
				System.out.println(((C)as[0]).getModel());
			}
			
			if(as[0] instanceof B) {
				((B)as[0]).steering();
			}
			
			C d = new C("honda");
			d.getModel();
			
		}
	
	}
