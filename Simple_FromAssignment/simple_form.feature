Feature: Simple Form Testing

  Scenario: Submit form with message
    Given I open the simple form page
    When I enter "Abhishek" into the first name field
    And I enter "Maurya" into the last name field
    And I enter "mauryaabhi3442@gmail.com" into the email field
    And I enter "7371815289" into the contact number field
    And I enter "Hello, this is a test message!" into the message field
    And I click the submit button
    Then I should see "Abhishek maurya" displayed in the result
    And I should see "mauryaabhi@gmail.com" displayed in the result
    And I should see "1234567890" displayed in the result
    And I should see "Hello, this is a test message!" displayed in the result
