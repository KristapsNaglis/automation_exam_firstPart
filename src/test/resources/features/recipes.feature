Feature: Shopping list

  Background: open application

  Scenario: Add a recipe through settings button
    Given I open the app
    When I add a new recipe through settings button with name "RecipeName"
    Then I see the new recipe added with name "RecipeName"
    When I enter the recipe "RecipeName"
    And I add a new ingredient "bread"
    Then I see the new added ingredient "bread"
    And I delete the the recipe

  Scenario: Add a recipe though input field "Add recipe..."
    Given I open the app
    When I add a new recipe through input field "Add a recipe..." with name "RecipeName"
    Then I see the new recipe added with name "RecipeName"
    When I enter the recipe "RecipeName"
    And I add a new ingredient "bread"
    Then I see the new added ingredient "bread"
    And I delete the the recipe