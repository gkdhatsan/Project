package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,features="C:\\Users\\USER\\eclipse-workspaceMarch\\Project\\src\\test\\resources\\ganesh.feature",glue="com.stepdefs")

public class TestRunner {
	
	
	
}
