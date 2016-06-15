package com.orilore.gb.test11;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hello=new String("hello");
		String hello1=new String("hello");
		System.out.println(hello==hello1);
		
		String hello2=new String("hello");
		String hello3="hello";
		System.out.println(hello3==hello2);
		
		System.out.println(hello2.equals(hello3));
			
		String hello4=new String("hello").intern();
		System.out.println(hello4==hello3);
		
		String hello5="hello";
		String hello6="hello";
		System.out.println(hello5==hello6);
	}

}
