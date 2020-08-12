Feature: Login
  as a User I want to login into mindtrans.com

  @SuccessLogin
  Scenario Outline: User can login into mindtrans.com with correct email and password
    Given I want to go to login page
    When I put email <email> into email field
    And I put password <password> into password field
    And I click on login button
    Then User is login into website

    Examples: 
      | email                        | password   |
      | muhammadnaufal9595@gmail.com | Test12345  |
      | akundobong@gmail.com         | 4kunDobong |

  @FailLogin
  Scenario: User cannot login into mindtrans.com if email is incorrect
    Given I want to go to login page2
    When I put  wrong email into email field
    And I put wrong password into password field
    And I click on login button2
    Then User is not login into website
