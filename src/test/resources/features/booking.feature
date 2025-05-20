Feature: test bookings

  Background:

  Scenario: get all bookings

    Given user navigates to bookings webpage
    When user requests booking id
    Then user receives the correct booking id