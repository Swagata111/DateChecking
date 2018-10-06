package com.capgemini.myDate;

import java.util.ArrayList;

public class DateDifferenceTest 
{
	
	public static void main(String[] args)
	{
		ArrayList<MyDateTestRecords> testData=new ArrayList<>();
		testData.add(new MyDateTestRecords(new MyDate(6,2,2011),new MyDate(6,2,2011),0));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,4,2011),12));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,5,2011),42));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,6,2011),73));
		
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2011),256
));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2012),622
				));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2013),987
));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2113),37511
));
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2413),147084
));
		
		testData.add(new MyDateTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2813),293181));
		testData.add(new MyDateTestRecords(new MyDate(6,1,2011),new MyDate(6,3,2011),59));
		
		testData.add(new MyDateTestRecords(new MyDate(6,1,2012),new MyDate(6,3,2012),60));
		testData.add(new MyDateTestRecords(new MyDate(6,2,2012),new MyDate(6,3,2012),29));
		
		testData.add(new MyDateTestRecords(new MyDate(22,1,2012),new MyDate(15,11,2012),298));
		testData.add(new MyDateTestRecords(new MyDate(6,2,2012),new MyDate(6,12,2012),304));
		
		
		for (MyDateTestRecords testcase:testData)
		{
			MyDate startDate=testcase.startDate;
			MyDate endDate=testcase.endDate;
			long expectedResult=testcase.expectedResults;
			long obtainedResult=DateDifference.getDateDifference(startDate, endDate);
			if(expectedResult==obtainedResult)
				System.out.println("Test case with expected result "+testcase.expectedResults+" Passed");
			else
				System.err.println("Test case with expected result "+testcase.expectedResults+"  Failed");
		}
	}

}
