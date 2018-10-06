package com.capgemini.myDate;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testGetDateDifference1() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(0, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference2() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 04, 2011);
		assertEquals(12, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference3() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 05, 2011);
		assertEquals(42, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference4() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 06, 2011);
		assertEquals(73, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference5() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2011);
		assertEquals(256, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference6() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2012);
		assertEquals(622, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference7() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2013);
		assertEquals(987, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference8() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2113);
		assertEquals(37511, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference9() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2413);
		assertEquals(147084, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference10() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2813);
		assertEquals(293181, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference11() 
	{
		MyDate startDate = new MyDate(06, 01, 2011);
		MyDate endDate = new MyDate(06, 03, 2011);
		assertEquals(59, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference12() 
	{
		MyDate startDate = new MyDate(06, 01, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(60, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference13() 
	{
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(29, DateDifference.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testGetDateDifference14() 
	{
		MyDate startDate = new MyDate(22, 01, 2012);
		MyDate endDate = new MyDate(15, 11, 2012);
		assertEquals(298, DateDifference.getDateDifference(startDate, endDate));
	}

	@Test
	public void testGetDateDifference15() 
	{
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 12, 2012);
		assertEquals(304, DateDifference.getDateDifference(startDate, endDate));
	}

}
