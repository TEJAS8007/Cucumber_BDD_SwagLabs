Feature:Testing login functionality

  Scenario Outline:Login Action
    Given user should launch chrome browser
    When User Navigate to "https://www.saucedemo.com/"
    And user should enter Email as "<email>" and password as "<password>"
    And click on login button

    Examples:
      |email|password|
      | standard_user           |secret_sauce|
      | problem_user            |secret_sauce|
      | performance_glitch_user |secret_sauce|
