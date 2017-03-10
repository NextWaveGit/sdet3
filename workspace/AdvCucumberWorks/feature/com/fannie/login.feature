@Sanity
Feature: Login Feature
Background:
Given Launch FireFox

@FirstDryRun
Scenario: check user for valid login
When user successfully logs in
|login     | password|
|adith.naveen|testing1|
|lee      |hello|
|sweta   |fdfak|

@BeforeRelease
Scenario: check user for valid login
When user successfully logs in
|login     | password|
|adith.naveen|testing1|
|lee      |hello|
|sweta   |fdfak|

@AfterRelease
Scenario: check user for valid login
When user successfully logs in
|login     | password|
|adith.naveen|testing1|


Then Show inbox
