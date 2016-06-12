package com.orilore.gb.test;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(true);
		list.add("hello world");
		for(int i=0;i<list.size();i++){
			Object o=list.get(i);
			if(o instanceof String ){
				String o1=(String)o;
						System.out.println(o1.toUpperCase());
			}
			if(o instanceof Integer){
				Integer o2=(Integer)o;
				System.out.println(o2.MAX_VALUE);
			}
			
			
		}
		

	}

}
