package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStep {
	
	@Before
	public void hookMethod(){
		System.out.println(" *********** Connecting to databse **********    ");
	}
	
	@Before("@FirstDryRun")
	public void betaTestCases(){
		System.out.println(" ######### Connect to old server ########## ");
	}
	
	@Given("Launch FireFox")
	public void setUp(){
		System.out.println("launching firefox browser");
	}
	
	
	@When("^user successfully logs in$")
	public void user_successfully_logs_in(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		
		for(Map<String, String> temp:list){
	    System.out.println("Login "+ temp.get("login"));
	    System.out.println("Password "+ temp.get("password"));
		}
	}

	@Then("^Show inbox$")
	public void show_inbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("kdjflksdj");
	}

	
	

}
