package com.orilore.gb.test5;

import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet<String> set=new TreeSet<String>();
		 set.add("hello");
		 set.add("ava");
		 set.add("world");
//		 set.add("hello");
//		 System.out.println(set.size());
		 Iterator<String> iter=set.iterator();
		 while(iter.hasNext()){
			 String s=iter.next();
			 System.out.println(s);
			 
			 
		 }
		
	
		
			
		

	}

}
