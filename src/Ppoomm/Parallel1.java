package Ppoomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1
{
public WebDriver driver;
@Parameters({"browser"})
@Test
public void runner1(String browser)
{
System.setProperty("webdriver.gecko.driver","./software1/geckoDriver.exe");	
System.setProperty("webdriver.chrome.driver","./software1/ChromeDriver.exe");
if(browser.equals("Firefox"))
{
	driver= new FirefoxDriver();
}
else
{
	driver=new ChromeDriver();
}
}
}
