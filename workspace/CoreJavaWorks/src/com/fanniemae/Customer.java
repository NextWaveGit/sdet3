package com.fanniemae;

	public class Customer {
		private int cId;
		private Name name;
		
		
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		public Name getName() {
			return name;
		}
		public void setName(Name name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Customer [cId=" + cId + ", name=" + name + "]";
		}


}
