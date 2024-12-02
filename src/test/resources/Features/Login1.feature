Feature: ORANGEHRM HOMEPAGE

Scenario: Login

    Given Open Browser
    Then Enter username<username>
    Then Enter password<password>
    And Click login button
    Then close the broswer
    
    Examples:
    |username|password|
    |Nikita|password123|
    |sagar|password123|

