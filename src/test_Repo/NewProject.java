package test_Repo;

import org.testng.annotations.Test;

import generic_LibraryorUtility.Base_Class;
import object_repository.Home_Page_Pom_Class;
import object_repository.NewProject_HomePage;
import object_repository.Tasks_Pom_Class;

public class NewProject extends Base_Class{
@Test
public void newProject() throws Exception
{
	Home_Page_Pom_Class HM=new Home_Page_Pom_Class(driver);
	HM.task();
	Tasks_Pom_Class TH=new Tasks_Pom_Class(driver);
	TH.addnew();
	TH.newProject();
	String PNAME=EUTIL.getDataFromExcel("Tasks",6,2);
	String CUSNAME=EUTIL.getDataFromExcel("Tasks",6,3);
	String PDESC=EUTIL.getDataFromExcel("Tasks",6,4);
	NewProject_HomePage NH=new NewProject_HomePage(driver);
	NH.newProject(PNAME, CUSNAME, PDESC);
}
}
