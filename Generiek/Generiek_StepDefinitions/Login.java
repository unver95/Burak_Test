package Burak_Test.Generiek.Generiek_StepDefinitions;

import Burak_Test.Generiek.Generiek_Pages.Generiek_Header;
import Burak_Test.Generiek.Generiek_Pages.Generiek_Login;
import Burak_Test.Utilities.GWD;
import Burak_Test.Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    Tools ts = new Tools();
    Generiek_Login gl = new Generiek_Login();
    Generiek_Header gh = new Generiek_Header();

    @Given("Ga naar {string}")
    public void gaNaar(String webSite) {
        GWD.getDriver().get(webSite);
    }

    @When("Klik op login")
    public void klikOpLogin() {
        ts.clickElement_Tools(gh.getLoginGeneriek());
    }

    @And("Enter de naam {string}")
    public void enterDeNaam(String naam) {
        ts.sendKeysElement_Tools(gl.getUsernameGeneriek(), naam);
    }

    @And("Enter de wachtwoord {string}")
    public void enterDeWachtwoord(String wachtwoord) {
        ts.sendKeysElement_Tools(gl.getPasswordGeneriek(), wachtwoord);
    }

    @And("Klik op in log")
    public void klikOpInLog() {
        ts.clickElementFromDOM_Tools(gl.getLoginGeneriek());
    }

    @Then("\\(Ingelogd als moet) zichtbaar zijn op de header")
    public void ingelogdAlsMoetZichtbaarZijnOpDeHeader() {

        ts.waitUntilElementDoesNotContainsText(gh.getLoginGeneriek(), "Inloggen"); // wacht tot dat "Inloggen" niet meer daar staat
        ts.verifyElementContainsText_Tools(gh.getLoginGeneriek(), "Ingelogd als"); // Kijk of "Ingelogd als" staat
    }
}
