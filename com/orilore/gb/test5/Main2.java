package com.orilore.gb.test5;

import java.util.Iterator;
import java.util.TreeSet;

import com.orilore.gb.test2.Employee;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelfComparator sf=new SelfComparator();
		TreeSet<Employee> set=new TreeSet<Employee>(sf);
		Employee e1=new Employee("001","zhangsan");
		Employee e2=new Employee("003","lisi");
		Employee e3=new Employee("002","wangwu");
		Employee e4=new Employee("004","zhaosi");
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		Iterator<Employee> iter=set.iterator();
		while(iter.hasNext()){
			Employee a=iter.next();
			System.out.println(a.getEmployeeno());
		}
		
		


	
	}
}
