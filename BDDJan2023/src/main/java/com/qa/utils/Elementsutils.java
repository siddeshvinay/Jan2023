package com.qa.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Elementsutils {
	
   
	public static String getDateTime(String strFormat){
        String strDate = null;
        Date dt = null;
        SimpleDateFormat sdf = null;
        try{
            dt = new Date();
            sdf = new SimpleDateFormat(strFormat);
            strDate = sdf.format(dt);
            return strDate;
            
        }catch(Exception e){
   
            return strDate;
        }
	
	}

}
