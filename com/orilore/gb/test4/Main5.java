package com.orilore.gb.test4;

import java.util.HashSet;

import com.orilore.gb.test2.Employee;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> set=new HashSet<Employee>();
		Employee e1=new Employee("001","q");
		Employee e2=new Employee("001","q");
		Employee e3=new Employee("002","w");
		//System.out.println(e1.equals(e2));
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set.size());

	}

}
