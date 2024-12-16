Feature: Account editing

  Background:
    Given Customer is logged in
    And Customer is on 'MyAccount' page

  Scenario Outline: Customer can edit his contact details
    Given Customer opens 'Account details' page
    When Customer clicks 'Modify contact details' button
    Then 'Contact details form' is displayed
    When Customer selects 'Gender' radio button
    And Customer adds First Name "<firstName>" Last Name "<lastName>" phone "<phone>"
    And Customer clicks 'Update' button
    Then 'Contact Details' page opens with updated information
    Examples:
      | firstName   | lastName   | phone      |
      | agtestOne   | agtestOne  | 0722111333 |