package Ppoomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2
{
//declaration
	@FindBy(id="email")
	private WebElement uname;
	
//initialization
	public pageModel1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//utilization
	public 
}
