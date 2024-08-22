package tstNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Qsp10
{
@Test(invocationCount = 3,priority=1)
public void post()
{
	Reporter.log("Sowmya",true);
}
@Test
public void post1()
{
	Reporter.log("Sweet heart",true);
}
}
