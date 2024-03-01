package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom_Class {
@FindBy(xpath =" //input[@name='username']")
private WebElement username;

@FindBy (xpath="//input[@name='pwd']")
private WebElement password;

@FindBy(xpath="//div[text()='Login ']")
private WebElement login;

public Login_Pom_Class(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public void loginoperation(String username,String password)
{
	this.username.sendKeys(username);
	this.password.sendKeys(password);
	this.login.click();
}
}
