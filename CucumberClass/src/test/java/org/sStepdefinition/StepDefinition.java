package org.sStepdefinition;

import java.util.List;

import org.Base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User must be in the facebook login page")
	public void user_must_be_in_the_facebook_login_page() {
		launchBrowser();
		launchUrl(  "https://www.facebook.com/");
		browserMaximize();
		
	   
	   
	}

	@When("User enter the invalid username and invalid password")
	public void user_enter_the_invalid_username_and_invalid_password(DataTable d) {
	 List<String> list=d.asList();
	  String name=list.get(1);
	  String phno=list.get(2);
	 
	WebElement username= driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.id("pass"));
	fill(username,name);
	fill(password, phno);
	  
	} 

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
	WebElement loginBtn= driver.findElement(By.name("login"));
	btnClick(loginBtn);
	Thread.sleep(3000);
	}

	@Then("User must be in invalid page")
	public void user_must_be_in_invalid_page() {
	String currentUrl=	driver.getCurrentUrl();
	  
	Assert.assertTrue("check the url",currentUrl.contains("privacy_mutation_token"));
	   
	   
	}


}
