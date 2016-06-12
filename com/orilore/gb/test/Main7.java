package com.orilore.gb.test;

import java.util.ArrayList;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		ArrayList list2=new ArrayList();
		list.add(11);
		list.add(22);
		list2.add(33);
		list2.add(44);
		//list.addAll(list);
		list.addAll(list2);
		for(Object o:list){
			
			System.out.println(o);
		}
		
		
		

	}

}
