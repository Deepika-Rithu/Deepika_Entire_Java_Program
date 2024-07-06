package iRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Pgm1 implements IRetryAnalyzer
{
	int initial_count=0;
	int retry_times=2;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initial_count<retry_times) 
		{
			initial_count++;
			return true;
		}
		return false;
	}

}
