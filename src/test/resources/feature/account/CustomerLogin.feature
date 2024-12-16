Feature: Homepage: Go to account

  Scenario Outline: Customer goes to account page
    Given Customer is on Homepage
    When Customer hover over 'Account' drop menu
    Then 'Login' button is displayed
    When Customer clicks 'login' button
    Then 'Login' page opens
    When Customer login with username <username> and password <password>
    And Customer clicks 'login' button
    Then 'MyAccount' page opens

    Examples:
      | username              | password   |
      | 'agtest1@yopmail.com' | 'Test1234' |

  Scenario: Customer wishlist
    Given Customer is on Homepage
    When Customer hover over 'Wishlist' drop menu
    Then 'Wishlist' button is displayed
    When Customer clicks 'Wishlist' button
    Then 'Login' page opens

  Scenario: Customer register
    Given Customer is on Homepage
    When Customer hover over 'Account' drop menu
    Then 'Register' button is displayed
    When Customer clicks 'Register new account' button
    Then 'Register' page opens
    When Customer register with details
      | Email            | email@email.com |
      | FirstName        | firstName       |
      | LastName         | lastName        |
      | Pasword          | Test1234        |
      | Confirm Password | ConfirmPassword |
    And Customer clicks 'Register' button
    Then 'MyAccount' page opens

    