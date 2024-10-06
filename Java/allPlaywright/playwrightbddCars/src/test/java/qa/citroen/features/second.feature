Feature: Products in main page

  Background: User opens the page
    Given the user is at homepage
    And the first time cookies are accepted
    When the user clicks "Solicitar Ofertas" button


  Scenario: User can see title in page of cars
    Given the user is at homepage
    Then title of page is the initial one

  Scenario: User selects the appearance
    Given the user is at homepage
	When the user clicks "Solicitar Ofertas" button
    Then a form is visible


  @debug
  Scenario Outline: User fills in the form
    #Given the user is at homepage
    #And the first time cookies are accepted
    #When the user clicks "Solicitar Ofertas" button
    And a form is visible
    Then the user fills in Nombre with "<name>"
    And the user fills in Email with "<theEmail>"
    And the user fills in CódigoPostal with "<zipCode>"
    And the user fills in Teléfono with "<phoneNumber>"
    And the user checks No Financiar
    And the user checks Acepto
    And the user wants to wait until check
    #And the user just reloads the page
    #And the user reloads the page and clicks above
    Examples:
      | name    | theEmail                     | zipCode | phoneNumber |
      | Lourdes | lourdesalternativa@yahoo.com | 42005   | 697974309   |

      # Citroën. Soria
      #| Lourdes | lourdesalternativa@yahoo.com | 42005   | 697974309   |

      # Ya enviado. Citroën. Cuenca
      #| Lourdes | lourdesalternativa@yahoo.com | 28760   | 697974309   |


      # Ya enviado. Citroën. Valladolid
      #| Lourdes | lourdesalternativa@yahoo.com | 47013   | 697974309   |


      # Peugeot 308. Barcelona
      #| Lourdes | lourdesalternativa@yahoo.com | 08030   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 08018   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 08014   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 08907   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 08024   | 697974309   |


      # Ya enviados. Dacia. Galicia
      #| Lourdes | lourdesalternativa@yahoo.com | 36143   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 27003   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 36214   | 697974309   |


      # No enviados. Dacia Galicia
      #| Lourdes | lourdesalternativa@yahoo.com | 15172   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 36213   | 697974309   |


      # Ya enviados. Citroën. Madrid
      #| Lourdes | lourdesalternativa@yahoo.com | 28007   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 28032   | 697974309   |


      # No enviados. Citroën. Madrid
      #| Lourdes | lourdesalternativa@yahoo.com | 28031   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 28018   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 28033   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 28011   | 697974309   |
      #| Lourdes | lourdesalternativa@yahoo.com | 28021   | 697974309   |

