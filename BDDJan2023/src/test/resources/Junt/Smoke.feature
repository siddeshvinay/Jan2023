Feature: Run somke test cases

   Scenario Outline: Login page title1
   Given Launch the browser
   And login to the application with user "admin" and "manager"
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application
   
 Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |Rahul|Mr  |Dravid  |wall_te@gmal.com |middle     |wall   |wall  |100    |101     | 111       |102      | 145  |
   
   
 Scenario Outline: Login page title two
   Given Launch the browser
   And login to the application with user "admin" and "manager"
   And Enter the user details "<FName>" "<MName>" "<LNane>" "<Email>" "<Username>" "<Password>" "<RetypePassword>"
   And select the Hiredate "<25 Oct 2021>"
   Given Enter the workdaysweekly "<Monday>" "<Tuesday>" "<Wednesday>" "<Thursday>" "<Friday>"
   Then Click on Create user button
   And Logout from Application
   
 Examples:
  |FName|MName|LNane|Email           |Username|Password  |RetypePassword |Monday | Tuesday | Wednesday | Thursday| Friday  |
  |Shewag|Mr  |veeru  |killer@gmal.com |opener     |veeru12   |veeru12  |100    |101     | 111       |102      | 145  |
   