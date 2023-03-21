package com.spicejet.genericUtility;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method is used to convert from string to any datatype
	 * @param s
	 * @param strategy
	 * @return
	 */
		public Object stringToAnyDataType(String s,String strategy)
		{
			Object convertedData=null;
			if(strategy.equals("int"))
			{
				convertedData=Integer.parseInt(s);
			}
			else if(strategy.equals("long"))
			{
				convertedData=Long.parseLong(s);
			}

			return	convertedData;
		}
		/**
		 * this method is used to generate random Number
		 * @param limit
		 * @return
		 */
		public int getRandomNumber(int limit)
		{
			int randomNumber=new Random().nextInt(limit);
			return randomNumber;
		}
		/**
		 * 
		 * this method is used to split the string 
		 * @param s
		 * @param stratagy
		 * @return
		 */
		public String[] splitString(String s,String stratagy)
		{
			return s.split(stratagy);
		}
		/**
		 * this method is used to get the month in number format
		 * @param s
		 * @return
		 */
		public int getMonthInMMFormat(String s)
		{
			int value=DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(s).get(ChronoField.MONTH_OF_YEAR);
			return value;
		}
	}


