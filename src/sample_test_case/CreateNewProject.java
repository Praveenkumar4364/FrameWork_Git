package sample_test_case;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_LibraryorUtility.Base_Class;
import generic_LibraryorUtility.Base_Class_For_CrossBrowser;
@Listeners(generic_LibraryorUtility.ListenersImplimentationClass.class)
public class CreateNewProject extends Base_Class {
	@Test(retryAnalyzer=generic_LibraryorUtility.RetryAnalyzerImplimentationClass.class)//(groups = {"regression","functional"})
	public void createProject() throws Exception {
			
			String PRJ= EUTIL.getDataFromExcel("Tasks",6,2);
			String CUSN= EUTIL.getDataFromExcel("Tasks",6,3);
			String PRJDESC= EUTIL.getDataFromExcel("Tasks",6,4);
			int RANDOM=JUTIL.getRandomNumber();
			driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys(PRJ);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
			driver.findElement(By.xpath("//div[text()='-- New Customer --']")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[]")).sendKeys(CUSN+RANDOM);
			driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys(PRJDESC);
			driver.findElement(By.xpath("//div[text()='Create Project']")).click();
			System.out.println("!!!!CreateNewProject Successfully!!!");
			Thread.sleep(3000);
			
			
	}
}


