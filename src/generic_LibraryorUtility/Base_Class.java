package generic_LibraryorUtility;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import object_repository.Login_Pom_Class;
import object_repository.Logout_Pom_Class;
public class Base_Class {
	public static WebDriver driver;
	public static PropertiesUtility PUTIL=new PropertiesUtility();
	public static JavaUtility JUTIL=new JavaUtility();
	public static ExcelUtility EUTIL=new ExcelUtility();
@BeforeSuite(alwaysRun = true)
public void dbConnection()
{
	System.out.println("DB Connection Successfull!!!");
}
@BeforeClass(alwaysRun = true)
public void launchBrowser() throws Exception
{
	String URL= PUTIL.getdataFromProperties("url");
	driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("Browser launched Successfully!!!");
}
@BeforeMethod(alwaysRun = true)
public void loginApp() throws Exception
{
	String USERNAME=PUTIL.getdataFromProperties("username");
	String PASSWORD=PUTIL.getdataFromProperties("password");
	Login_Pom_Class lg=new Login_Pom_Class(driver);
	lg.loginoperation(USERNAME,PASSWORD);
	System.out.println("Login Successfully!!");
}
@AfterMethod(alwaysRun = true)
public void logoutApp()
{
	Logout_Pom_Class log=new Logout_Pom_Class(driver);
	log.logoutoperation();
	//driver.findElement(By.xpath("//a[text()='Logout']")).click();
	System.out.println("Logout Successfull!!");
}
@AfterClass(alwaysRun = true)
public void closeBrowser()
{
	driver.quit();
	System.out.println("Window closed Successfully!!!");
}
@AfterSuite(alwaysRun = true)
public void closeDbConnection()
{
	System.out.println("Db Connection closed successfull!!!");
}
}
