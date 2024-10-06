Feature: Products in main page


  Scenario: User can see title in page of cars
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
    Then the user fills in Nombre with "<name>"
    And the user fills in Email with "<theEmail>"
    And the user fills in CódigoPostal with "<zipCode>"
    And the user fills in Teléfono with "<phoneNumber>"
    And the user checks No Financiar
    And the user checks Acepto
    #And the user wants to wait until check
    #And the user clicks 2nd Solicitar
    Examples:
      | name    | theEmail                     | zipCode | phoneNumber |
      | Lourdes | lourdesalternativa@yahoo.com | 36143   | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | 27003   | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | 36214   | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | 15172   | 697974309   |
      | Lourdes | lourdesalternativa@yahoo.com | 36213   | 697974309   |

