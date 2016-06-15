package com.orilore.gb.test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1994-9-16";
		Date d=new Date();
		long l=d.getTime();
		System.out.println(l);
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		long l2=0;
		try {
			Date d2=s.parse(str);
			 l2=d2.getTime();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long l3=l-l2;
		System.out.println(l3/1000/60/60/24);
		
		
		
	}

}
