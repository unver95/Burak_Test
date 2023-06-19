Feature: Bewerk

  Background:

    Given Ga naar "https://www-ts.zorginzicht.nl/"
    When Klik op login
    And Enter de naam "Riwka"
    And Enter de wachtwoord "Welkom03!"
    And Klik op in log
    Then (Ingelogd als moet) zichtbaar zijn op de header


Scenario: Als Riwka wil ik de Meetinstrumenten bewerken

