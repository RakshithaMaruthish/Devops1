package tstNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script
{
public WebDriver driver;
@BeforeMethod
public void OpenAppln()
{
	System.setProperty("webdriver.gecko.driver","./software1/geckoDriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}
@AfterMethod
public void CloseAppln()
{
	driver.close();
}
}
