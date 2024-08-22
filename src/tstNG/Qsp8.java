package tstNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Qsp8
{
@Test
public void compose()
{
	Reporter.log("mail composed",true);
}
@Test(dependsOnMethods = "compose")
public void sentItems()
{
	Reporter.log("mail sent",true);
	Assert.fail();
}
@Test(dependsOnMethods = "sentItems")
public void trash()
{
	Reporter.log("mail deleted",true);
}
}
