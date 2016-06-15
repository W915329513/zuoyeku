package com.orilore.gb.test11;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello";
		String b="java";
		String c="world";
		String d="hellojavaworld";
		String e=a+b+c;
		System.out.println(d==e);
		
		System.out.println(e.intern()==d);
				
				

	}

}
