package com.orilore.gb.test5;

public class Lion extends Animal {
	
	private String live;
	public Lion(String name,String sex,String live){
		super(name,sex);
		this.live=live;
		
	}
	protected void HJ(){
		
		System.out.println(super.getname()+"ÔÚº¿½Ð");
	}

}
