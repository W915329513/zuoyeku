package com.orilore.gb.test;

import java.util.ArrayList;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		ArrayList list2=new ArrayList();
		list.add(1);
		list2.add("b");
		list2.add("c");
//	    list.addAll(list2);
//	   
//	    Integer flag=(Integer)list.remove(0);
//        System.out.println(flag+1);
		
        list.addAll(list2);
		boolean a=list.removeAll(list2);
		System.out.println(a);
		
	  
		for(Object o:list){
			System.out.println(o);
		}
	}

}
