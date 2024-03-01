package test_Repo;
import org.testng.annotations.Test;
import generic_LibraryorUtility.Base_Class;
import object_repository.Home_Page_Pom_Class;
import object_repository.New_User_HomePage_Pom_Class;
import object_repository.Users_Pom_Class;
public class LoginActitime extends Base_Class{
@Test
public void Login() throws Exception
{
	Home_Page_Pom_Class HM=new Home_Page_Pom_Class(driver);
	//HM.task();
	//HM.reports();
	//HM.settings();
	HM.users();
	Users_Pom_Class UH=new Users_Pom_Class(driver);
	UH.newuser();
	String FN= EUTIL.getDataFromExcel("Users",2,2);
	String LN= EUTIL.getDataFromExcel("Users",2,3);
	String EM= EUTIL.getDataFromExcel("Users",2,4);
	New_User_HomePage_Pom_Class NP=new New_User_HomePage_Pom_Class(driver);
	NP.newUser(FN, LN, EM);
}
}