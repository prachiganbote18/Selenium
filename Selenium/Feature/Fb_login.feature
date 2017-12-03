
Feature:Facebook Login verification
@FB
    Scenario: Successfull login to facebook
  Given open URL"https://www.facebook.com/" 
    And Username "prachi.ganbote@yahoo.com"
    And password "1234"
    When Click on "Log In"
  Then validate error"The password that you've entered is incorrect." message