
Feature: Insta log

  Scenario: User Able to Log in or not
    Given Launch Browser
    Then Enter Username "<Username>"
    And Enter Password "<Password>"
    Then Click on Login button
    And Verify Login
    And Close the Browser

  
    Examples: 
    		|Username|Password|
    		| Nikita  | Nikita1234 | 
        | nick_y |  avdh7yedyh | 
        |nick_xtheti|Nikita678|
       
