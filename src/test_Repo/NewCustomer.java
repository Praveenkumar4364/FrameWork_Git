package test_Repo;

import org.testng.annotations.Test;

import generic_LibraryorUtility.Base_Class;
import object_repository.Home_Page_Pom_Class;
import object_repository.NewCustomer_Pom_Class;
import object_repository.Tasks_Pom_Class;

public class NewCustomer extends Base_Class{
	@Test
public void customer() throws Exception
{
	Home_Page_Pom_Class HM=new Home_Page_Pom_Class(driver);
	HM.task();
	Tasks_Pom_Class TH=new Tasks_Pom_Class(driver);
	TH.addnew();
	TH.newCustomer();
	String CUSNAME=EUTIL.getDataFromExcel("Tasks",2,2);
	String CUSDESC=EUTIL.getDataFromExcel("Tasks",2,3);
	int Random=JUTIL.getRandomNumber();
	NewCustomer_Pom_Class NH=new NewCustomer_Pom_Class(driver);
	NH.newCUstomer(CUSNAME+Random, CUSDESC);
}
}
