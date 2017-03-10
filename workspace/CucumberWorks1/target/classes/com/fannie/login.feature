@Sanity
Feature: Login Feature
Scenario: check user for valid login
When user successfully logs in
|login     | password|
|adith.naveen|testing1|
|lee      |hello|
|sweta   |fdfak|

Then Show inbox
