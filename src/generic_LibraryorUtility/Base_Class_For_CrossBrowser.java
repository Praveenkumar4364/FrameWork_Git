package generic_LibraryorUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base_Class_For_CrossBrowser {
	public static WebDriver driver;
	public static PropertiesUtility PUTIL=new PropertiesUtility();
	public static JavaUtility JUTIL=new JavaUtility();
	public static ExcelUtility EUTIL=new ExcelUtility();

@BeforeSuite(alwaysRun = true)
public void dbConnection()
{
	System.out.println("DB Connection Successfull!!!");
}
@Parameters("browser")
@BeforeClass(alwaysRun = true)
public void launchBrowser(String browser) throws Exception
{
	String URL= PUTIL.getdataFromProperties("url");
	if(browser.equalsIgnoreCase("chrome"))
	{
	driver=new ChromeDriver();
	driver.get(URL);
	System.out.println("Chrome Launched");
	}
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get(URL);
		System.out.println("FireFox Launched");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("Browser launched Successfully!!!");
}
@BeforeMethod(alwaysRun = true)
public void loginApp() throws Exception
{
	String UN=PUTIL.getdataFromProperties("username");
	String PWD= PUTIL.getdataFromProperties("password");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
	System.out.println("Login Successfully!!");
}
@AfterMethod(alwaysRun = true)
public void logoutApp()
{
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
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
