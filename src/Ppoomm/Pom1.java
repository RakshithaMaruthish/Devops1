package Ppoomm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pom1 
{
@Test
public void runData() throws InterruptedException
{
	WebElement ele=driver.findElement(By.id("email"));
	ele.sendKeys("admin");
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	ele.sendKeys("admin");
}
}