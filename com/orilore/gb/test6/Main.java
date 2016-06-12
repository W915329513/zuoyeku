package com.orilore.gb.test6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



import com.orilore.gb.test2.Employee;

import com.orilore.gb.test5.SelfComparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		SelfComparator sf=new SelfComparator();
		TreeSet<Employee> set=new TreeSet<Employee>(sf);
		System.out.println("欢迎进入员工管理系统");
		boolean flag=true;
		while(flag){
			System.out.println("录入员工信息按1");
			System.out.println("删除员工信息按2");
			System.out.println("更新员工信息按3");
			System.out.println("查询员工信息按4");
			int userselect=s.nextInt();
			switch(userselect){
			case 1:
				System.out.println("请输入员工号");
				String employeeno=s.next();
				Employee e1 =getPositionEmployee(set,employeeno);
				if(e1==null){
					System.out.println("请输入员工姓名");
					String employeename=s.next();
					Employee newe=new Employee(employeeno,employeename);
					set.add(newe);
				}
				else{
					System.out.println("你输入的员工号重复");
				}
				
				break;
			case 2:
				System.out.println("请输入要删除的员工号");
			    String employeeno2=s.next();
			    Employee e2=getPositionEmployee(set,employeeno2);
			    if(e2!=null){
			    	set.remove(e2);
			    }
			    else{
			    	
			    	System.out.println("你输入的员工号不存在");
			    }
				
				
				
				break;
			case 3: 
				System.out.println("请输入你要更新的员工号");
				String employeeno3=s.next();
				Employee e3=getPositionEmployee(set,employeeno3);
				if(e3!=null){
					System.out.println("请输入新的姓名");
					String employeename3=s.next();
					e3.setEmployeename(employeename3);
					
				
				}
				else{
					System.out.println("你输入的员工号不存在");
				}
				
				
				break;
			case 4:
				Iterator<Employee>  iter4= set.iterator();
				while(iter4.hasNext()){
					Employee e4=iter4.next();
					System.out.println("==============");
					System.out.println(e4.getEmployeeno());
					System.out.println(e4.getEmployeename());
					System.out.println("==============");
				}
				
				
				
				break;
			
			}
			
			
			System.out.println("继续请按1其他退出");
			String userselect2=s.next();
			if(!userselect2.equals("1")){
				break;
				
			}
			
			
			
			
		}
		

	}
	
	public static Employee getPositionEmployee(TreeSet<Employee>set,String employeeno){
		Employee e=null;
		Iterator<Employee>  iter= set.iterator();
		while(iter.hasNext()){
			
			Employee em=iter.next();
			if(em.getEmployeeno().equals(employeeno)){
			    e=em;
			    }
			break;
		}
		
	    
		return e;
	}


	 
		  }
	

