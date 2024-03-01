package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks_Pom_Class {
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addnew;

@FindBy(xpath = "//div[@class='item createNewCustomer']")
private WebElement newCustomer;

@FindBy(xpath = "//div[@class='item createNewProject']")
private WebElement newProject;

public Tasks_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getAddnew() {
	return addnew;
}

public WebElement getNewCustomer() {
	return newCustomer;
}

public WebElement getNewProject()
{
	return newProject;
}

public void addnew()
{
	addnew.click();
}
public void newCustomer()
{
	newCustomer.click();
}
public void newProject()
{
	newProject.click();
}
}
