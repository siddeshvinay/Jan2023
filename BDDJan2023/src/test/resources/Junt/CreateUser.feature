Feature: Create user and delete User

   Scenario Outline: Login page title
   Given Launch the browser
   And login to the application with user "admin" and "manager"
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application
   
 Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |Sachin|Mr  |Ten  |sac_te@gmal.com |ST      |master   |master  |100    |101     | 111       |102      | 145  |
   
    
   Scenario Outline: Validate the user 
   Given Launch the browser
   And login to the application with user "admin" and "manager"
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application


 Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |tes  |Ms   |Siddu|Diya_sj@gmal.com|Mgudi   |mgudi |mgudi      |10    | 0.45    | 0.75      | 0.95    | 0.225   |

    
    Scenario: Validate new user
    Given Launch the browser
    And login to the application with user "Mgudi" and "mgudi"
    Then Navigate to home page
    And Logout from Application
    
    
   Scenario Outline: Delete the user 
   Given Launch the browser
   And login to the application with user "admin" and "manager"
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application
   And login to the application with user "admin" and "manager"
   Then Select the user "Siddu, chin Ms."
   Then Delete the User
   And Logout from Application

Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |chin  |Ms   |Siddu|Diya_sj@gmal.com|Gudi   |mgudi |mgudi      |10    | 0.45    | 0.75      | 0.95    | 0.225   |
 
