package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Adactin.feature" ,
glue="com.step" ,dryRun=false ,
plugin= {"json:src\\test\\resources\\Reports\\Sample.json" ,"rerun:src\\test\\resources\\Reports\\Failed.txt"} , tags="@sanity")
public class TestRunner {
	
	
	@AfterClass
	public static void afterClass() {
 
		JvmReports.generateJvmReport("C:\\Users\\DEEPAK KUMAR M\\eclipse-workspace\\CucumberNew\\src\\test\\resources\\Reports\\Sample.json");
	}

	
}
