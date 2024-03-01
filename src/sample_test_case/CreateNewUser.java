package sample_test_case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_LibraryorUtility.Base_Class;

public class CreateNewUser extends Base_Class {
	@Test(groups = {"smoke","regression"})
	public void createnewUser() throws Exception {
		String FN= EUTIL.getDataFromExcel("Users",2,2);
		String LN= EUTIL.getDataFromExcel("Users",2,3);
		String EM= EUTIL.getDataFromExcel("Users",2,4);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(FN);
		driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LN);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(EM);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		System.out.println("!!!!!CreateNewUser Successfully!!!!!");
	}
}
