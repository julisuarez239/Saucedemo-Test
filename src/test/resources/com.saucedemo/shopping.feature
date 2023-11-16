Feature: user use auto complete in the application

  Scenario Outline: user use auto complete in the application
    Given user open application
    And login in aplication
    When purchasing process
      | <option> | <product> |
    Then validates that the text is reflected "<product>"

    Examples:
      | option              | product                  |
      | Price (high to low) | Sauce Labs Fleece Jacket |