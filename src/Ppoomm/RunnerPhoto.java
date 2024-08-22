package Ppoomm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunnerPhoto extends Generic_Photo
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.gecko.driver","./software1/geckoDriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void CloseAppln(ITestResult res)
	{
		driver.close();
	}
}
