package com.pratian.pas.automation.TestClasses;

import java.io.IOException;

import com.pratian.pas.automation.FileHandling.PropertyManager;

public class SampleTest extends BaseTest{
	
	public void sampleTest() throws IOException
	{
		driver.get(PropertyManager.getProperty("url.app"));
		
	}

}
