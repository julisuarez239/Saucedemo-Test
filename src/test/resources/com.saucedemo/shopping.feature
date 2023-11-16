Feature: user buy a product in the application

  Scenario Outline: user buy a product in the application
    Given user open application
    And login in aplication
    When purchasing process
      | <option> | <product> |
    Then validates that the text is reflected "<product>"

    Examples:
      | option              | product                  |
      | Price (high to low) | Sauce Labs Fleece Jacket |