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
	public static String property;

	
	@AfterClass
	public static void afterClass() {
		  property = System.getProperty("user.dir");

		JvmReports.generateJvmReport(property+"/src/test/resources/Reports/Sample.json");
	}

	
}
