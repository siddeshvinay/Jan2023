Feature: Login page feature


   Scenario Outline: Login page title
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    Then Navigate to home page
   Given Click on Add User button
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application
   
 Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |tes  |Ms   |Siddu|Diya_sj@gmal.com|Mgudi   |mgudi |mgudi      |10    | 0.45    | 0.75      | 0.95    | 0.225   |
  |Lio  |Ms   |Egl  |a_sj@gmal.com   |Gudi     |Gudi     |Gudi   |12    | 8       | 11  | 7       | 14  |
  |Sachin|Mr  |Ten  |sac_te@gmal.com |ST      |master   |master  |100    |101     | 111       |102      | 145  |
   
  Scenario: Validate user
    Given user is on login page
    When user gets the title of the page
    When user enters username "ST"
    And user enters password "master"
    And user clicks on Login button
    Then Navigate to home page
    And Logout from Application
    
    Scenario: Delete user
    Given user is on login page
    When user gets the title of the page
    And login to the application with user "admin" and "manager"
    Then Navigate to home page
    Given Close the popup
    Then Select the user "Ten, Sachin Mr."
    Then Delete the User
    And Logout from Application
    
    


    




    


