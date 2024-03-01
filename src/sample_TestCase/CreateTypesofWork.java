
/*
 * access actitime
 * do login operation
 * click on settings
 * click on types of work
 * click on create type of work
 * provide name,billing rate
 * click on create type of work
 * log out
 * close the window
 */
package sample_TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_LibraryorUtility.ExcelUtility;
import generic_LibraryorUtility.JavaUtility;
import generic_LibraryorUtility.PropertiesUtility;

public class CreateTypesofWork {
public static void main(String[] args) throws Exception {
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN= PUTIL.getdataFromProperties("username");
	String PWD= PUTIL.getdataFromProperties("password");
	String URL= PUTIL.getdataFromProperties("url");
	
	ExcelUtility EUTIL=new ExcelUtility();
	String WN= EUTIL.getDataFromExcel("Settings",4,3);
	String WBR= EUTIL.getDataFromExcel("Settings",4,4);
	
	JavaUtility JUTIL=new JavaUtility();
	int Random=JUTIL.getRandomNumber();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(WN+Random);
	driver.findElement(By.xpath("//input[@class='rate']")).sendKeys(WBR);
	driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.quit();
}
}
