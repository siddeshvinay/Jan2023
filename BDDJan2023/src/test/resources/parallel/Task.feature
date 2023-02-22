Feature: Create a project and Customer

Scenario: Create a project and customer
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    Given Close the popup
    Then Open the Task and create Customer "Jan2025" "New customer5"
    And Create a project to the respective customer "Week1" "Jan2025"
    Then Create a task to the Customer "Work from home"
    And validate the tasks
    Then logout from the application
    
    
    #Given User login to the "PayCRM" application using "qaDetails" credentials
  
 Scenario: Add addtional task to the existing project
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    Given Close the popup
    And Open the Task page and create new tasks
    Then Add new tasks to the existing project "FCR"
    And logout from the application
    Given user is on login page
    
    
  Scenario: Delete the tasks
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    Then Close the popup
    Given Select the task in Completed tasks and delete them "FCR1"
    And logout from the application
    
    #Examples: 
    #|Tasks|
    #|FCR1|
    #|FCR2|
  

    Scenario: Delete Project and Customer
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    And Navigate to Project and customer page, select the Project and customer and Delete them
    But validate the deleted Project and customer
    Then logout from the application
    

    
     
 