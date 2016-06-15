package com.orilore.gb.test7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		TX tx=new JX("蓝色");
		TX t=new SJX("红色");
		p.Draw(tx);
		p.Draw(t);
		
		JX j=new JX("白色");
		SJX s=new SJX("黑色");
		p.Draw(j);
		p.Draw(s);
		
		
		

	}

}
