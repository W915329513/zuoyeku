package com.orilore.gb.test5;

public class Animal {
	
	private String name;
	private String sex;
	public Animal(String name,String sex){
		
		this.name=name;
		this.sex=sex;
	}
	
	protected void Sleep(){
		
		System.out.println(this.name+"��˯��");
	}

		String getname(){
		
		return name;
	}
}
