package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_Pom_Class {
@FindBy (xpath = "//div[text()='New User']")
private WebElement newuser;

public Users_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getNewuser() {
	return newuser;
}

public void newuser()
{
	newuser.click();
}

}
