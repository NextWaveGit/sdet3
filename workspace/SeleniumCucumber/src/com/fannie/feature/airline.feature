@Sanity
Feature: Travel between to location

Background:

Given Chrome Browser
When airline pom

Scenario Outline:

Given click on flights tab
And enter "<flyfrom>" src location 
And enter "<flyto>" dest locaion
And enter "<departuredate>" start date
And enter "<returndate>" return date
When click on search button
Then show the flight information


Examples:
|flyfrom       |flyto               |departuredate        | returndate  |
|Washington, DC (WAS-All Airports)  |New York, NY (NYC-All Airports)    |03/17/2017 | 03/31/2017 |
