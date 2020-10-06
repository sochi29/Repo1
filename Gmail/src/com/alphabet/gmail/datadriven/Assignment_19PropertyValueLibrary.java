package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class Assignment_19PropertyValueLibrary
{
	public static void getValue(String filePath)
	{
		
		//Object data=null;
		try
		{
			FileInputStream propertyFile = new FileInputStream(filePath);
			Properties prop = new Properties();
			prop.load(propertyFile);
			// prop.getProperty(key);
			Collection<Object> value = prop.values();
			Iterator<Object> i=value.iterator();
			int a=1;
			while(i.hasNext())
			{
				
				String val=(String)i.next();
				System.out.println("Values "+a+" "+ val);
				a++;
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		//return value;
		//return value;
	}	

}
