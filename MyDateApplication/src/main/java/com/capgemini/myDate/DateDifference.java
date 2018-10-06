package com.capgemini.myDate;

public class DateDifference 
{
	static int[] daysMonths= {31,28,31,30,31,30,31,31,30,31,30,31};
	static int[] daysMonthsLeapyear= {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public static int getDateDifference(MyDate startDate,MyDate endDate)
	{
		int diff=0;
		int yyStart=startDate.getYear();
		int yyEnd=endDate.getYear();
		int diffMonth=0;
		int yd=0;
		if(sameMonth(startDate,endDate) && sameYear(startDate,endDate) && sameDay(startDate,endDate))
		{
			return 0;
		}
		else if(sameMonth(startDate,endDate) && sameYear(startDate,endDate))
		{
			diff=getDays(startDate,endDate);
		}
		
		else if(sameYear(startDate,endDate))
		{
			 if(checkLeapYear(yyStart))
				{
				 diffMonth=daysForLeapyear(startDate, endDate);
					diff=diffMonth+getDays(startDate,endDate);
				}
			 else
				 diff=getDays(startDate,endDate)+getMonths(startDate, endDate);
		}
		
		else if(yyEnd-yyStart>=1)
		{
			for(int y=startDate.getYear();y<=endDate.getYear()-1;y++)
			{
				if(checkLeapYear(y))
				{
				  yd+=366;	
				}
				else if(checkLeapYear(startDate.getYear()))
					yd+=366;	
				else if(checkLeapYear(endDate.getYear()))
					yd+=366;	
			 else
				 yd+=365;
			diff=getDays(startDate,endDate)+getMonths(startDate, endDate)+yd;
			}
		}
		
		return diff;
	}
	
	private static boolean sameMonth(MyDate startDate,MyDate endDate)
	{
		if(startDate.getMonth()==endDate.getMonth())
		{
			return true;
		}
		else
			return false;
	}
	
	private static boolean sameYear(MyDate startDate,MyDate endDate)
	{
		if(startDate.getYear()==endDate.getYear())
		{
			return true;
		}
		else
			return false;
	}
	private static boolean sameDay(MyDate startDate,MyDate endDate)
	{
		if(startDate.getDay()==endDate.getDay())
		{
			return true;
		}
		else
			return false;
	}
	
	private static int getDays(MyDate startDate,MyDate endDate)
	{
		return endDate.getDay()-startDate.getDay();
	}
	
	private static int getMonths(MyDate startDate,MyDate endDate)
	{
		int diffMonth=0;
		for(int i=startDate.getMonth();i<endDate.getMonth();i++)
			 diffMonth+=(daysMonths[i-1]);
		return diffMonth;			
	}
	
	private static int getYears(MyDate startDate,MyDate endDate)
	{
		return (endDate.getYear()-startDate.getYear())*365;
	}
	
	private static int daysForLeapyear(MyDate startDate,MyDate endDate)
	{
		int diffMonth=0;
		for(int i=startDate.getMonth();i<endDate.getMonth();i++)
		{
			  diffMonth+=(daysMonthsLeapyear[i-1]);	
		}
			return diffMonth;
	}
	private static boolean checkLeapYear(int year)
	{
		boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
		return flag;
	}
}
