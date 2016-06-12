package com.orilore.gb.test;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(1.0);
		list.add(2.0);
		list.add(true);
		
		Double a=(Double) list.get(1);
		Double b=(Double) list.get(0);
		Boolean c=(Boolean)list.get(2);
		
		System.out.println(c);
		

	}

}
