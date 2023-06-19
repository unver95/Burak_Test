package Burak_Test.Generiek.Generiek_StepDefinitions;

import Burak_Test.Generiek.Generiek_Pages.Generiek_GlobalNav;
import Burak_Test.Utilities.Tools;
import io.cucumber.java.en.And;

public class GlobalNav {
    Tools ts = new Tools();
    Generiek_GlobalNav gg = new Generiek_GlobalNav();

    @And("Klik op Beheer")
    public void klikOpBeheer() {
        ts.clickElement_Tools(gg.getDashboard());
    }

    @And("Klik op Persoonlijke ruimte")
    public void klikOpPersoonlijkeRuimte() {
        ts.clickElement_Tools(gg.getPersoonlijkeRuimte());
    }

    @And("Klik op submit")
    public void klikOpSubmit() {
        ts.clickElement_Tools(gg.getSubmit());
    }
}
