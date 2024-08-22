package tstNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Qsp11
{
@Test
public void main()
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/maps");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id=']")).click();
	driver.findElement(By.partialLinkText("")).click();
}
@Test(dependsOnMethods = "main")
public void main1()
{
	System.setProperty("webdriver/chrome/driver","./software/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement ele=driver.findElement(By.id("year"));
	Select s= new Select(ele);
	List<WebElement> opt=s.getOptions();
	System.out.println(opt.size());	
	Assert.fail();
}
@Test(dependsOnMethods = "main1")
public void main2() throws AWTException
{
	System.setProperty("webdriver.chrome.driver","./software/ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act= new Actions(driver);
	act.contextClick().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
}
}
