package com.orilore.gb.test7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		TX tx=new JX("��ɫ");
		TX t=new SJX("��ɫ");
		p.Draw(tx);
		p.Draw(t);
		
		JX j=new JX("��ɫ");
		SJX s=new SJX("��ɫ");
		p.Draw(j);
		p.Draw(s);
		
		
		

	}

}
