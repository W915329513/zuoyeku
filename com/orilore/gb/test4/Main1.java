package com.orilore.gb.test4;

import java.util.HashSet;

import com.orilore.gb.test2.Employee;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add("hello");
		set.add(100);
		set.add(new Employee("001","qwe"));
		for(Object r:set){
			
			System.out.println(r);
		}
		

	}

}
