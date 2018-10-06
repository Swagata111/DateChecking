package com.capgemini.myDate;

public class MyDateTestRecords 
{
	public MyDate startDate;
	public MyDate endDate;
	public long expectedResults;
	public MyDateTestRecords(MyDate startDate, MyDate endDate, int expectedResults) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedResults = expectedResults;
	}
	
}
