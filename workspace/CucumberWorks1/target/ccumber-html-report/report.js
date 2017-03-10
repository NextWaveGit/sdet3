$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creditscore.feature");
formatter.feature({
  "line": 2,
  "name": "To sanction the loan for customers",
  "description": "",
  "id": "to-sanction-the-loan-for-customers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "To issue loan for full time working employee",
  "description": "",
  "id": "to-sanction-the-loan-for-customers;to-issue-loan-for-full-time-working-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Employee has a credit score",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "According to bank standard",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "customer has \"full\" time work",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "In \"govt\" office",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "should be repay in \"five\" years",
  "keyword": "But "
});
formatter.match({
  "location": "CreditScoreStep.employee_has_a_credit_score()"
});
formatter.result({
  "duration": 94060802,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "duration": 84338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "full",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_part_time_work(String)"
});
formatter.result({
  "duration": 2849651,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "govt",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_govt_office(String)"
});
formatter.result({
  "duration": 109773,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "duration": 70951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "five",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_be_repay_in_five_years(String)"
});
formatter.result({
  "duration": 105758,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To issue loan for full time working employee",
  "description": "",
  "id": "to-sanction-the-loan-for-customers;to-issue-loan-for-full-time-working-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Employee has a credit score",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "According to bank standard",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "customer has \"part\" time work",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "In \"private\" office",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "should be repay in \"four\" years",
  "keyword": "But "
});
formatter.match({
  "location": "CreditScoreStep.employee_has_a_credit_score()"
});
formatter.result({
  "duration": 76307,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "duration": 66043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "part",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_part_time_work(String)"
});
formatter.result({
  "duration": 104865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "private",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_govt_office(String)"
});
formatter.result({
  "duration": 122268,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "duration": 63811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "four",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_be_repay_in_five_years(String)"
});
formatter.result({
  "duration": 126731,
  "status": "passed"
});
});