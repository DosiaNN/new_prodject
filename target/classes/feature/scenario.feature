Feature: Some feature

  Background:
    Given open browser
    And go to shop
    And add produckt to basket
    And open basket

    Scenario: use corret code
      When user input corret code
      Then diskcout

      Scenario:
      When user input incorrect code
      Then discount is not added to product price

