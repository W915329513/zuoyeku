package com.orilore.gb.test6;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TX tx=new SJX();
		TX tx2=new JX();
		Person p=new Person();
		p.Draw(tx);
		p.Draw(tx2);
		
		SJX s=new SJX();
		JX j=new JX();
		p.Draw(s);
		p.Draw(j);
	}

}
