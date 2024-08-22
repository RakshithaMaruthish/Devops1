package tstNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner2 extends Generic_Script
{
@Test
public void reData()
{
	driver.findElement(By.id("email")).sendKeys("Rakshitha");
	driver.findElement(By.id("pass")).sendKeys("Rakshith148");
	driver.findElement(By.name("login")).click();
	String title=driver.getTitle();
	Assert.assertEquals(title,"Facebook-log in or sign up");
	System.out.println("INDIA");
}
}
