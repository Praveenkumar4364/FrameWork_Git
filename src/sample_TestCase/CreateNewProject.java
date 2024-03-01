/*
 * access actitime
 * do the login operation
 * click on task
 * click on addnew
 * click on new project
 * enter project name from excel
 * clik on new customer provide new customer name
 * add project description 
 * click on create project
 * logout 
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


public class CreateNewProject {
public static void main(String[] args) throws Exception {
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN= PUTIL.getdataFromProperties("username");
	String PWD= PUTIL.getdataFromProperties("password");
	String URL= PUTIL.getdataFromProperties("url");
	
	ExcelUtility EUTIL=new ExcelUtility();
	String PRJ= EUTIL.getDataFromExcel("Tasks",6,2);
	String CUSN= EUTIL.getDataFromExcel("Tasks",6,3);
	String PRJDESC= EUTIL.getDataFromExcel("Tasks",6,4);
	
	JavaUtility JUTIL=new JavaUtility();
	int RANDOM=JUTIL.getRandomNumber();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys(PRJ);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
	driver.findElement(By.xpath("//div[text()='-- New Customer --']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSN+RANDOM);
	driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys(PRJDESC);
	driver.findElement(By.xpath("//div[text()='Create Project']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
}
}
