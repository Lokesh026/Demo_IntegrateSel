package helloWorld;

import org.testng.Assert;
import org.testng.annotations.Test;

import Util.RetryAnalyzer;

@Test (retryAnalyzer =RetryAnalyzer.class)
public class reRunMavenTest {
	
	  public void MatryxsoftWebsite() 
	  {
		  System.out.println ("Hello Matryxsoft");
		  Assert.assertTrue(true);
	  }
	  
	  public void MatryxsoftWebsite1() 
	  {
		  System.out.println ("Hello Matryxsoft1");
		  Assert.assertTrue(false);
	  }
	  }
