package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {

	public static void generateJvmReport(String jsonFile) {
 
		File f=new File("C:\\Users\\DEEPAK KUMAR M\\eclipse-workspace\\CucumberNew\\src\\test\\resources\\Reports");
		
		Configuration c=new Configuration(f, "AdactinWebAutomation");
		
		c.addClassifications("platformName", "Windows");
 		c.addClassifications("platformVersion", "10");
		c.addClassifications("buildNo", "12266554");
		c.addClassifications("sprintNo", "12");
		
 		List<String> l=new ArrayList<String>();
		l.add(jsonFile);
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
		
		



 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
