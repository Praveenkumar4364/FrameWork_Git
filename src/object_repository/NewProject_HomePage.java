package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProject_HomePage {
@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
private WebElement projectname;

@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
private WebElement description;

@FindBy(xpath = "//input[@fdprocessedid='l7ugkw']")
private WebElement box;

@FindBy(xpath = "//div[text()='-- New Customer --']")
private WebElement newuser;

@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[3]")
private WebElement cusname;

@FindBy(xpath = "//div[text()='Create Project']")
private WebElement createproject;

public NewProject_HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getProjectname() {
	return projectname;
}

public WebElement getDescription() {
	return description;
}

public WebElement getBox() {
	return box;
}

public WebElement getNewuser() {
	return newuser;
}

public WebElement getCusname() {
	return cusname;
}

public WebElement getCreateproject() {
	return createproject;
}

public void newProject(String projectname,String cusname,String description)
{
	this.projectname.sendKeys(projectname);
	box.click();
	newuser.click();
	this.cusname.sendKeys(cusname);
	this.description.sendKeys(description);
	createproject.click();
}
}
