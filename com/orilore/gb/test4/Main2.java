package com.orilore.gb.test4;

import java.util.HashSet;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		set.add("hello");
		set.add("java");
		set.add("world");
		for(String s:set){
			System.out.println(s);
		}
//		Iterator<String> iter = set.iterator();
//
//		
//		  while(iter.hasNext()){
//			  
//			  String str = iter.next();
//			  
//			  System.out.println(str);
//			  
//		  }
//	

	}

}
