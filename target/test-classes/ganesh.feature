Feature: Validate Login

  Background: configure url
    Given Open Browser
    When Perform Url

  Scenario Outline: Validate Login with Valid Credential
    Given User Enter "<username>" and "<password>"
    When Perform Login
    And verify Login Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
    Examples: 
      | username | password |
      | ganesh   | kumar    |


