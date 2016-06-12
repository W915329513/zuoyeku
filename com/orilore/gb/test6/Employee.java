package com.orilore.gb.test6;

public class Employee {
	
private String employeeno;
	
	private String employeename;
	
   

	public Employee(String employeeno,String employeename){
    	
    	  this.employeename = employeename;
    	  
    	  this.employeeno = employeeno;
    	
    	
    }
	
	
	 public String getEmployeeno() {
			return employeeno;
		}

		public void setEmployeeno(String employeeno) {
			this.employeeno = employeeno;
		}

		public String getEmployeename() {
			return employeename;
		}

		public void setEmployeename(String employeename) {
			this.employeename = employeename;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			
			 boolean flag = false;
			
			 Employee e = (Employee)obj;
			 
			 if(this.employeeno.equals(e.getEmployeeno())&&this.getEmployeename().equals(e.getEmployeename())){
				 
				 
				 flag = true;
				 
				 
			 }
			 
			 
			 
			 
			 
			
			
			return flag;
		}


		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 1;
		}
	
	

}
