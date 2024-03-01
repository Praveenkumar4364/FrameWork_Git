package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer_Pom_Class {
@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement customername;

@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement customerDescription;

@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement createCustomer;

public NewCustomer_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getCutomername() {
	return customername;
}


public WebElement getCustomerDescription() {
	return customerDescription;
}


public WebElement getCreateCustomer() {
	return createCustomer;
}


public void newCUstomer(String customername,String customerDescription)
{
	this.customername.sendKeys(customername);
	this.customerDescription.sendKeys(customerDescription);
	createCustomer.click();
}
}
