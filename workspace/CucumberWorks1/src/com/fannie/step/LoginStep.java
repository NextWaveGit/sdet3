package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStep {
	
	@When("^user successfully logs in$")
	public void user_successfully_logs_in(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
	    System.out.println(list.get(0).get("login"));
	    System.out.println(list.get(0).get("password"));
	    System.out.println(list.get(1).get("login"));
	    System.out.println(list.get(1).get("password"));
	    System.out.println(list.get(2).get("login"));
	    System.out.println(list.get(2).get("password"));
	}

	@Then("^Show inbox$")
	public void show_inbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("kdjflksdj");
	}

	
	

}
