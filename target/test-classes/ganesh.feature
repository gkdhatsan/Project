Feature: Validate Login

  Background: configure url
    Given Open Browser
    When Perform Url

  Scenario Outline: Validate Login with Valid Credential
    Given User Enter "<username>" and "<password>"
    When Perform Login

    Examples: 
      | username | password |
      | ganesh   | kumar    |
  #  Examples: 
  #    | username | password |
  #    | ganesh   | kumar    |
   #   | bala     | murugan  |
