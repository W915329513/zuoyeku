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
		System.out.println("��ӭ����Ա������ϵͳ");
		boolean flag=true;
		while(flag){
			System.out.println("¼��Ա����Ϣ��1");
			System.out.println("ɾ��Ա����Ϣ��2");
			System.out.println("����Ա����Ϣ��3");
			System.out.println("��ѯԱ����Ϣ��4");
			int userselect=s.nextInt();
			switch(userselect){
			case 1:
				System.out.println("������Ա����");
				String employeeno=s.next();
				Employee e1 =getPositionEmployee(set,employeeno);
				if(e1==null){
					System.out.println("������Ա������");
					String employeename=s.next();
					Employee newe=new Employee(employeeno,employeename);
					set.add(newe);
				}
				else{
					System.out.println("�������Ա�����ظ�");
				}
				
				break;
			case 2:
				System.out.println("������Ҫɾ����Ա����");
			    String employeeno2=s.next();
			    Employee e2=getPositionEmployee(set,employeeno2);
			    if(e2!=null){
			    	set.remove(e2);
			    }
			    else{
			    	
			    	System.out.println("�������Ա���Ų�����");
			    }
				
				
				
				break;
			case 3: 
				System.out.println("��������Ҫ���µ�Ա����");
				String employeeno3=s.next();
				Employee e3=getPositionEmployee(set,employeeno3);
				if(e3!=null){
					System.out.println("�������µ�����");
					String employeename3=s.next();
					e3.setEmployeename(employeename3);
					
				
				}
				else{
					System.out.println("�������Ա���Ų�����");
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
			
			
			System.out.println("�����밴1�����˳�");
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
	
