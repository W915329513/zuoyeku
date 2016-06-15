package com.orilore.gb.test12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c=Calendar.getInstance();
		c.set(2016, 7, 15);
		Date d=c.getTime();
		System.out.println(d);
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String q=s.format(d);
		System.out.println(q);
		


		
        
		
		 
		 

	}

}
