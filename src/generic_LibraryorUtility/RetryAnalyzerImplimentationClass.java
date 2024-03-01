package generic_LibraryorUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplimentationClass implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int retry=3;
		while(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}

}
