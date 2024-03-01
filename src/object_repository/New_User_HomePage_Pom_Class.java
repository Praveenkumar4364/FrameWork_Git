package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_User_HomePage_Pom_Class {
@FindBy(xpath = "(//input[@name='firstName'])[2]")
private WebElement firstname;

@FindBy (xpath = "(//input[@name='lastName'])[2]")
private WebElement lastname;

@FindBy (xpath = "(//input[@name='email'])[2]")
private WebElement email;

@FindBy(xpath = "//div[text()='Save & Send Invitation']")
private WebElement savebutton;

@FindBy(xpath = "(//span[text()='Close'])[1]")
private WebElement close;
public New_User_HomePage_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getSavebutton()
{
	return savebutton;
}
public WebElement getClose()
{
	return close;
}
public void newUser(String firstname,String lastname,String email) throws Exception
{
	this.firstname.sendKeys(firstname);
	this.lastname.sendKeys(lastname);
	this.email.sendKeys(email);
	savebutton.click();
	close.click();
}

}
