package sample_TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_LibraryorUtility.ExcelUtility;
import generic_LibraryorUtility.JavaUtility;
import generic_LibraryorUtility.PropertiesUtility;

/*
 * access actitime 
 * do the login operation(fetch data from properties utility)
 * click on task
 * click on add new
 * click on new customer
 * provide customer name and description(fetch data from excel utility)
 * click on create customer
 * do the log out operation and close the window
 * -------NOTE:- customer name should not be duplicate-------
 * */
public class Login_To_actitime {
public static void main(String[] args) throws Exception {
	/*read data from properties file*/
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN= PUTIL.getdataFromProperties("username");
	String PWD= PUTIL.getdataFromProperties("password");
	String URL= PUTIL.getdataFromProperties("url");
	/*read data from excel*/
	ExcelUtility EUTIL=new ExcelUtility();
	String CUSNAME= EUTIL.getDataFromExcel("Tasks",2,2);
	String CUSDESC= EUTIL.getDataFromExcel("Tasks",2,3);
	/*Javautility object creation*/
	JavaUtility JUTIL=new JavaUtility();
	int RANDOM=JUTIL.getRandomNumber();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSNAME+RANDOM);
	driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys(CUSDESC);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
