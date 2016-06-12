package com.orilore.gb.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Employee>list=new ArrayList<Employee>();
		System.out.println("欢迎来到员工管理系统");
		boolean flag=true;
		while(flag){
		System.out.println("录入员工按1");
		System.out.println("删除员工按2");
		System.out.println("更新员工按3");
        System.out.println("查询员工按4");
        int userselect=s.nextInt();
        switch(userselect){
        case 1: 
        	System.out.println("请输入员工学号");
        	String employeeno=s.next();
        	int index=IndexOfEmployeeposition(list,employeeno);
        	if(index==-1){
        		System.out.println("请输入员工姓名");
            	String employeename=s.next();
            	Employee employee=new Employee(employeeno,employeename);
            	list.add(employee);
        	}
        	else{
        		System.out.println("你输入的员工号重复");
        		
        	}
            	
     
        	break;
        case 2:
        	System.out.println("请输入你要删除的员工的学号");
        	String employeeno2=s.next();
        	int index2=IndexOfEmployeeposition(list,employeeno2);
        	if(index2==-1){
        		System.out.println("你输入的员工号不存在");
        		
        		
        	}
        	else{
        		list.remove(index2);
        	}
        	
        	break;
        case 3:
        	System.out.println("输入你要更新的员工号");
        	String employeeno3=s.next();
        	int index3=IndexOfEmployeeposition(list,employeeno3);
        	if(index3!=-1){
        		Employee updateemployee=list.get(index3);
        		
        		System.out.println("输入新的员工的名字");
        		String updateployeename=s.next();
        		updateemployee.setEmployeename(updateployeename);
        	}
        	else{
        		System.out.println("你输入的员工号不存在");
        	}
        	
        	break;
        case 4: for(Employee e:list){
        	
        	System.out.println("----------");
        	System.out.println(e.getEmployeeno());
        	System.out.println(e.getEmployeename());
        	System.out.println("----------");
        }
        	
        	break;     
        
        
        
        }
	     System.out.println("继续按1非1退出");
	        int userselect2=s.nextInt();
	        if(userselect2!=1){
	        	break;
	         }
   
		
		}

		
	}
	public static int IndexOfEmployeeposition(ArrayList<Employee>list,String employeeno){
		int index=-1;
		for(int i=0;i<list.size();i++){
			Employee employee=list.get(i);
			if(employee.getEmployeeno().equals(employeeno)){
				
				index=i;
				break;
			}
			
			
		}
		return index;
		
		
		
	}
	
	

}
