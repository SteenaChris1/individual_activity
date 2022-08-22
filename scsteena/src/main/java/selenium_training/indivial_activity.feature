
@tag
Feature: Orangehrm Login

Scenario: Loogin to orange hrm
    Given Launch the browser
    When Enter username
    And Enter password
    Then Click on login button
 
Examples:  
      | username  | Password | 
      | Admin     | admin123 | 
      
 
Feature: Orangehrm ADD Admin

  Scenario: Add an admin
    Given Redirect to admin menu
    When Click on add button
    And Enter user role
    And Enter employee name
    And Enter status
    And Enter username
    And Enter password 
    And Enter confirm password
    Then Click on save button
    

Feature: Orangehrm Search Admin

Scenario: Search an admin user
    Given Search user
    When Enter admin name
    And Enter user role
    And Enter emp name
    And Enter the status
    Then Click on search  button
  
Feature: Orangehrm add pim

Scenario: Add employee in pim
    Given Redirect to pim menu
    When Click on add button
    And Enter first name
    And Enter last name
    Then Click on save button   
    Then Click on Logout button   
   
Examples:  
      | firstname  | Lastname | 
      | Chris      | Kookie   | 
         