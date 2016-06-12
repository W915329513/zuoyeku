package com.orilore.gb.test;

import java.util.ArrayList;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();

		
		list.add(1);
		list.add(2);
		list.add(1,10);
		list.add(3,3);
		
		
		
		for(Object o:list){
			
			//Integer o1=(Integer)o;
		   
			System.out.println(o);
		
		}
	}

}
