package sample_test_case;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_LibraryorUtility.Base_Class;
public class CreateTypesofWork extends Base_Class {
	@Test(groups = {"smoke","functional"})
	public void createTypesOfWork() throws Exception {
		String WN= EUTIL.getDataFromExcel("Settings",4,3);
		String WBR= EUTIL.getDataFromExcel("Settings",4,4);
		int Random=JUTIL.getRandomNumber();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(WN+Random);
		driver.findElement(By.xpath("//input[@class='rate']")).sendKeys(WBR);
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		System.out.println("!!!!!!CreateTypesofWork Successfully!!!!!");
	}
}
