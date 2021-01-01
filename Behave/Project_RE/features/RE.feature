# file:features\RE.feature
Feature: Buying Real Estate

    ***********************************************************
    We need to know if the representant is buying houses
    in the best interest of the company.
    To be considered:
    - house conditions and price,
    - house external and internal look and client perceptions

    ***********************************************************

    Scenario: Too high price
        Given the house is in good conditions
        When the price is too high
        Then the rep must not buy

    Scenario: Too low price
        Given the house is in good conditions
        When the price is too low
        Then the rep must suspect

    Scenario: Ugly house
        Given the house looks bad designed and decorated
        When the client does not like it
        Then the rep should not buy

    Scenario: Beautiful house
        Given the house looks well designed and bad decorated
        When the client likes it but not so much
        Then the rep should consider risks

    Scenario: Awesome house
        Given the house looks well designed and decorated
        When the client is delighted
        Then the rep should buy immediately

    
