package com.orilore.gb.test11;

public class Main4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		
		//replace() CharAT()  indexof()  lastIndexof()  equals() length()  subString()
		
		
		String url="Http://www.baidu.com";
		String a=url.replace("baidu","sougo");
		System.out.println(a);
		
		char b=url.charAt(3);
		System.out.println(b);
		
		int c=url.length();
		System.out.println(c);
		
		int d=url.lastIndexOf("w");
		System.out.println(d);
		
		int e=url.indexOf("w");
		System.out.println(e);
		
		String f=url.substring(0,7);
		System.out.println(f);
		
		

	}

}
