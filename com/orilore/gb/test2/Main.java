package com.orilore.gb.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Employee>list=new ArrayList<Employee>();
		System.out.println("��ӭ����Ա������ϵͳ");
		boolean flag=true;
		while(flag){
		System.out.println("¼��Ա����1");
		System.out.println("ɾ��Ա����2");
		System.out.println("����Ա����3");
        System.out.println("��ѯԱ����4");
        int userselect=s.nextInt();
        switch(userselect){
        case 1: 
        	System.out.println("������Ա��ѧ��");
        	String employeeno=s.next();
        	int index=IndexOfEmployeeposition(list,employeeno);
        	if(index==-1){
        		System.out.println("������Ա������");
            	String employeename=s.next();
            	Employee employee=new Employee(employeeno,employeename);
            	list.add(employee);
        	}
        	else{
        		System.out.println("�������Ա�����ظ�");
        		
        	}
            	
     
        	break;
        case 2:
        	System.out.println("��������Ҫɾ����Ա����ѧ��");
        	String employeeno2=s.next();
        	int index2=IndexOfEmployeeposition(list,employeeno2);
        	if(index2==-1){
        		System.out.println("�������Ա���Ų�����");
        		
        		
        	}
        	else{
        		list.remove(index2);
        	}
        	
        	break;
        case 3:
        	System.out.println("������Ҫ���µ�Ա����");
        	String employeeno3=s.next();
        	int index3=IndexOfEmployeeposition(list,employeeno3);
        	if(index3!=-1){
        		Employee updateemployee=list.get(index3);
        		
        		System.out.println("�����µ�Ա��������");
        		String updateployeename=s.next();
        		updateemployee.setEmployeename(updateployeename);
        	}
        	else{
        		System.out.println("�������Ա���Ų�����");
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
	     System.out.println("������1��1�˳�");
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