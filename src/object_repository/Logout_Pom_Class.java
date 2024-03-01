package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Pom_Class {
	@FindBy (xpath = "//a[text()='Logout']")
private WebElement logout;

	public Logout_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public void logoutoperation()
	{
		logout.click();
	}
	
}
