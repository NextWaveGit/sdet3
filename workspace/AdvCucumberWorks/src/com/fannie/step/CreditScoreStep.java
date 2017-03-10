package com.fannie.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreStep {
	
	@Given("^Employee has a credit score$")
	public void employee_has_a_credit_score() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("lskdfjsldfkj;dslkjl");
	}

	@Given("^According to bank standard$")
	public void according_to_bank_standard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl");
	}
/*
	@When("^customer has full time work$")
	public void customer_has_full_time_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl");
	}
*/
	@When("^In \"([a-zA-Z]{1,})\" office$")
	public void in_govt_office(String location) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl "+location);
	}

	@Then("^Sanction loan$")
	public void sanction_loan() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl");
	}

	@Then("^should be repay in \"([a-zA-Z]{1,})\" years$")
	public void should_be_repay_in_five_years(String term) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl "+ term);
	}

	@When("^customer has \"([a-zA-Z]{1,})\" time work$")
	public void customer_has_part_time_work(String work) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl "+work);
	}
	
	@Then("^should be repay in \"([^\"]*)\" years$")
	public void should_be_repay_in_years(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl "+arg1);
	}


	/*
	@When("^In private office$")
	public void in_private_office() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl");
	}

	@Then("^should be repay in four years$")
	public void should_be_repay_in_four_years() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lskdfjsldfkj;dslkjl");
	}
*/
}
