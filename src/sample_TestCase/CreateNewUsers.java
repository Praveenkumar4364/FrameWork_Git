
/*access actitime do login operation
 * click on users 
 * click onnew users
 * provide 1st name,last name,mail id
 * click on save and send invitation
 * click on close
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
import generic_LibraryorUtility.PropertiesUtility;

public class CreateNewUsers {
public static void main(String[] args) throws Exception {
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN= PUTIL.getdataFromProperties("username");
	String PWD= PUTIL.getdataFromProperties("password");
	String URL= PUTIL.getdataFromProperties("url");
	
	ExcelUtility EUTIL=new ExcelUtility();
	String FN= EUTIL.getDataFromExcel("Users",2,2);
	String LN= EUTIL.getDataFromExcel("Users",2,3);
	String EM= EUTIL.getDataFromExcel("Users",2,4);
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
	driver.findElement(By.xpath("//div[@id='container_users']")).click();
	driver.findElement(By.xpath("//div[text()='New User']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(FN);
	driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LN);
	driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(EM);
	driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.quit();
}
}
