package com.orilore.gb.test;

import java.util.ArrayList;

public class Main9 {
	public static void main(String[] arge){
		
		ArrayList list=new ArrayList();
		
		list.add("hello");
		list.add(new String("world"));
		//boolean a=list.remove(new String("hello"));
		//System.out.println(a);
//		String b=(String)list.remove(0);
//		System.out.println(b);
		
		list.remove(1);
		for(Object o:list){
			
			System.out.println(o);
		}
		
	}

}
