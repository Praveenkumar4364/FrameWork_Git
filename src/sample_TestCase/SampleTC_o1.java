package sample_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_LibraryorUtility.PropertiesUtility;

public class SampleTC_o1 {
public static void main(String[] args) throws Exception {
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN=PUTIL.getdataFromProperties("username");
	String PWD=PUTIL.getdataFromProperties("password");
	String URL=PUTIL.getdataFromProperties("url");
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
}
}
