package com.orilore.gb.test2;

public class Employee {
	
	private String Employeename;
	private String Employeeno;
	public Employee(String Employeeno,String Employeename){
		
		this.Employeename=Employeename;
		this.Employeeno=Employeeno;
		
	}
	public String getEmployeeno(){
		
		return Employeeno;
	}
	public void setEmployeeno(String Employeeno){
		
		this.Employeeno=Employeeno;
		
	}
	public String getEmployeename(){
		return Employeename;
	}
	public void setEmployeename(String Employeename){
		
		this.Employeename=Employeename;
	}

	
}
