package tstNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1_Script extends Generic_Script
{
@Test
public void rundata()
{
	driver.findElement(By.id("email")).sendKeys("Rakshith Gowda");
	driver.findElement(By.id("pass")).sendKeys("Rakshithrakshu143@");
	driver.findElement(By.name("login")).click();
}
@Test
public void rundata1()
{
	driver.findElement(By.id("email")).sendKeys("Aishu");
	driver.findElement(By.id("pass")).sendKeys("Arjun125");
	driver.findElement(By.name("login")).click();
}
}
