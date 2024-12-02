Feature: TestDemo Web Login
  
  Scenario: Launch
    Given Launch Browser
    Then Enter Username <Username>
    Then Enter Password <Password>
    And Click on Login button
    Then Close Browser
    
    Examples:
    |Username|password|
    	|Nikita|Nikita123|
    			|Abc|Abc123|
    	|student|Password123|
    