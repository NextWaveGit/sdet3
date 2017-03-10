package com.fannie.step;

import org.openqa.selenium.WebDriver;

import com.fannie.pom.DriverFactory;
import com.fannie.pom.FlightPagePOMFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AirelineStep {

	private WebDriver driver;
	private FlightPagePOMFactory factory;

	@Given("^Chrome Browser$")
	public void chrome_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = DriverFactory.getDriverFacotry("chrome");
	}

	@When("^airline pom$")
	public void airline_pom() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://expedia.com");
		factory = new FlightPagePOMFactory(driver);

	}

	@Given("^click on flights tab$")
	public void click_on_flights_tab() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.clickFlightTab();
	}

	@Given("^enter \"([^\"]*)\" src location$")
	public void enter_src_location(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.sendFlyingFrom(arg1);
	}

	@Given("^enter \"([^\"]*)\" dest locaion$")
	public void enter_dest_locaion(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.sendFlyingTo(arg1);
	}

	@Given("^enter \"([^\"]*)\" start date$")
	public void enter_start_date(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.sendDepartingDate(arg1);
	}

	@Given("^enter \"([^\"]*)\" return date$")
	public void enter_return_date(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.sendReturnDate(arg1);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		factory.clickSearchButton1();
	}

	@Then("^show the flight information$")
	public void show_the_flight_information() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
