package Qsp;

import org.testng.annotations.Test;

public class Crpt1 {

	@Test
	public void demo()
	{
		// TODO Auto-generated method stub
		int c=123456789;
		int count=0;
		while(c!=0)
		{
			int rem=c%10;
			if(rem%2==0)
				count++;
			c=c/10;
			}
			System.out.println(count);
		}
	}