Feature: Products in main page

  @debug
  Scenario: User can see title in C4X page
    Given the user is at homepage
    Then title of page is the initial one


  Scenario: User selects the appareance
    Given the user is at homepage
	When the user clicks "Solicitar Ofertas" button
    And a form is visible

    # --------- A partir de aquí
    And the user enters a name
    And the user enters an email
    And the user enters a phone number
    And the user enters a zip code
    And the user does not want to by on credit
    And the user accepts the data privacy


	  #And verify the product price in cart is correct
	  #Examples:
	  #  | product_at_number |
	#	  | 1 |
	#	  | 2 |