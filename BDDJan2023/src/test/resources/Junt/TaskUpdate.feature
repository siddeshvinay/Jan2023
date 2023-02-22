Feature: Create Customer project and Tasks

Background: 
    Given Launch the browser
    And user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"

Scenario: Create Customer and Projects

Given Launch application and Create Customer and Project "Customer" "CustomerDescription" "ProjectName" "Task1" "Task2"
Then Assgin the Task to the Projects "FCR"
And  Task and Delete the Tasks "FCR1"
Then Delete the Customer and Project
And Logout Form the Application

#Examples:
#|Exxon|Oil Business|Bussines Rules   |OnCreate    |OnSave|
#
#
#Scenario: Create Customer Projects and assgin existing projects to Customer
#Given Launch application and Create Customer and Project "Shark" and "Leogle"
#And Create new customer "Shark2" and assign the existing project "Leogle" 
#Then Add additional Task to the Projects 
#And Logout from the application

