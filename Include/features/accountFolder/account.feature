#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Account
Feature: User is able to reset password
  I want to reset my password if i forget

  @ForgetPassword
  Scenario: User can reset password with user email
    Given I want to go to login page3
    When I click Trouble Loging in?
    And I put my email into email field
    And I click Reset Password button
    Then User is going to login page again

  @ResendConfirm
  Scenario: User can request Resend Confirmation Email
    Given I Want to go to Login page
    When I click Resend Confirmation Instructions
    And I put My Email into Email Field
    And I click send button
    Then User is Going to Login page
