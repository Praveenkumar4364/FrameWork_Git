package object_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_Page_Pom_Class {
@FindBy (xpath = "//div[@id='container_tasks']")
private WebElement task;

@FindBy (xpath = "//div[@id='container_reports']")
private WebElement reports;

@FindBy (xpath = "//div[@id='container_users']")
private WebElement users;

@FindBy (xpath = "(//div[@class='menu_icon'])[2]")
private WebElement settings;

public Home_Page_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getTask() {
	return task;
}

public WebElement getReports() {
	return reports;
}

public WebElement getUsers() {
	return users;
}

public WebElement getSettings() {
	return settings;
}
/**
 * This is a Business library for task
 */
public void task()
{
	task.click();
}
/**
 * This is a Business library for reports
 */
public void reports()
{
	reports.click();
}
/**
 * This is a Business library for users
 */
public void users()
{
	users.click();
}
/**
 * This is a Business library for settings
 */
public void settings()
{
	settings.click();
}
}
