package com.orilore.gb.test4;

import java.util.HashSet;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="zhangsan";
		HashSet<String> set=new HashSet<String>();
		set.add("hello");
		set.add("java");
		set.add("world");
//		set.add(name);
//		set.remove("name");
//		System.out.println(set.remove("name"));
//		
		for(String s:set){
			System.out.println(s);
		}
	}

}
