package Ppoomm;

import java.util.Date;

import org.testng.annotations.Test;

public class CurrentDate
{
@Test
	public void d1()
	{
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		System.out.println(d2);
	}
}
