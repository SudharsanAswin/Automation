package com.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeExecution() {
		launch();
		loadUrl("https://adactinhotelapp.com/index.php");
	}
	
	@After
	public void afterExecution(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)x;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");
		}
		
		quit();
	
 	}

}
