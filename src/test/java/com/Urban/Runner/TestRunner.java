package com.Urban.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/features/urbanTest.feature",
glue="com.Urban.stepDefinitions",

dryRun=false,
monochrome=true,
strict=true

)
public class TestRunner {

}
