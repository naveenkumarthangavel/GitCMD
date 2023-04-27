package org.sStepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Feature",               
glue= "org.sStepdefinition",dryRun=false,monochrome=false




public class TestRunnerClass {

}
