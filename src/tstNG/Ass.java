package tstNG;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ass extends Generic_Script
{
@Test
public void Fcassrt()
{
	driver.findElement(By.id("email")).sendKeys("Rakshitha");
	driver.findElement(By.id("pass")).sendKeys("Rakshith148");
	driver.findElement(By.name("login")).click();
	String title=driver.getTitle();
	SoftAssert sa=new SoftAssert();
	sa.assertAll();
	System.out.println("INDIA");
}
}
