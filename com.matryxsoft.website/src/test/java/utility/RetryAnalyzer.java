package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int iCount= 1;
	int iLimit = 2;
	
  @Override 
   public boolean retry(ITestResult result)
    {
    	if (iCount<iLimit)
	      {
    		iCount++;
    		return true;
	      }
	return false;
    }
}
