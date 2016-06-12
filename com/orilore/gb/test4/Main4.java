package com.orilore.gb.test4;

import java.util.HashSet;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		String s="hello";
		set.add(s);
		set.add(s);
		set.add(s);
		set.add("hello");
		System.out.println(set.size());
		for(String str:set){
			System.out.println(str);
			
			
		}
		

	}

}
