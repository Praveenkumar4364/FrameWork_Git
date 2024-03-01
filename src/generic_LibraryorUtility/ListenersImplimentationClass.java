package generic_LibraryorUtility;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;
public class ListenersImplimentationClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" is start");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" is Pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" is Fail");
		TakesScreenshot ts=(TakesScreenshot)Base_Class.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenShotFolder//"+methodName+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" is Skipped");
	}
}
