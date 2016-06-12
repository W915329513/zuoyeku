package com.orilore.gb.test3;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list=new ArrayList<String>();
		String str ="Hello";
		list.add(str);
		list.add("hello");
		list.add(str);
		list.remove(str);
		for(String s:list){
			System.out.println(s);
			
		}

	}

}
