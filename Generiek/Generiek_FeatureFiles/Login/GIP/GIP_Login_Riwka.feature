Feature: Logging feature

  Scenario: Login als
    Given Ga naar "https://www-ts.gipdatabank.nl/"
    When Klik op login
    And Enter de naam "Riwka"
    And Enter de wachtwoord "Welkom03!"
    And Klik op in log
    Then (Ingelogd als moet) zichtbaar zijn op de header