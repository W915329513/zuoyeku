package com.orilore.gb.test;

import java.util.ArrayList;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		
		//list.remove(0);
		list.remove(1);
		for(Object o:list){
			
			System.out.println(o);
		}
		

	}

}
