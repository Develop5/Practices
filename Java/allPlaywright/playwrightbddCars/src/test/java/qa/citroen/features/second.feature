Feature: Products in main page


  Scenario: User can see title in C4X page
    Given the user is at homepage
    Then title of page is the initial one

  Scenario: User selects the appearance
    Given the user is at homepage
	When the user clicks "Solicitar Ofertas" button
    Then a form is visible


  @debug
  Scenario Outline: User fills in the form
    Given the user is at homepage
    When the user clicks "Solicitar Ofertas" button
    And a form is visible
    Then the user fills in "Nombre" with "<name>"
    And the user fills in "Email" with "<theEmail>"
    And the user fills in "Código Postal" with "<zipCode>"
    And the user fills in "Teléfono" with "<phoneNumber>"
    And the user checks "No Financiar"
    And the user checks "Acepto el aviso protección datos"


    Examples:
      | name    | theEmail                     | zipCode | phoneNumber |
      | Lourdes | lourdesalternativa@yahoo.com | 80008   | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | zipCode | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | zipCode | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | zipCode | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | zipCode | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | zipCode | 697974309   |



    # --------- A partir de aquí
    #And the user enters a name
    #And the user enters an email
    #And the user enters a phone number
    #And the user enters a zip code
    #And the user does not want to by on credit
    #And the user accepts the data privacy


	  #And verify the product price in cart is correct
	  #Examples:
	  #  | product_at_number |
	#	  | 1 |
	#	  | 2 |