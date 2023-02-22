package com.roughexamples;

public class str_int {
	
	
	public void Workdays(String mon) {
		
		String Mon="1";
		
	 	  int mon1= Integer.parseInt(Mon);
			/*
			 * int tue =Integer.parseInt("Tue"); int wed =Integer.parseInt("Wed"); int thur
			 * =Integer.parseInt("Thur"); int fri=Integer.parseInt("Fri"); int
			 * sat=Integer.parseInt("Sat"); int sun=Integer.parseInt("Sun");
			 */
    	  
    	//  mon=1; tue=2; wed=3; thur=4; fri=5; sat=6; sun=7;
    	  
    	  System.out.println(mon1);
	}

	public static void main(String[] args) {
		str_int wd= new str_int();
		 wd.Workdays("monday");
		

	}

}
