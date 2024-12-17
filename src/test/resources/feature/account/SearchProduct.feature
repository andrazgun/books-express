Feature: Search products

  Scenario: Search experience for product search
    Given Customer opens search Page
    When Customer clicks search form
    And Customer adds 'keyword' keyword in search form
    And Customer clicks 'Submit' button
    Then 'Search' page opens
    And Product list is displayed
