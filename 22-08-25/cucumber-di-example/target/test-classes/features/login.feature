Feature: Login Functionality

  Scenario: Valid user logs in
    Given the user enters username "user1" and password "pass1"
    When the user logs in
    Then the user should be logged in successfully

   Scenario: Invalid user logs in
  	Given the user enters username "wrong" and password "wrong"
  	When the user logs in
    Then the user should not be logged in
