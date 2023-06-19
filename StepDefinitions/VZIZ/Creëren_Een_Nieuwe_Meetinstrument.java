    package Burak_Test.StepDefinitions.VZIZ;

import Burak_Test.Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Creëren_Een_Nieuwe_Meetinstrument {

    Tools ts = new Tools();

    @Given("Klik op “Meetinstrumenten“")
    public void klikOpMeetinstrumenten() {
        ts.createElementByPartialLinkText("Meetinstrumenten").click();
    }

    @And("Klik op “+“")
    public void klikOp() {
    }

    @And("Klik op “Nieuwe meetinstrument“")
    public void klikOpNieuweMeetinstrument() {
    }

    @When("Vul in de “Titel“ form panel")
    public void vulInDeTitelFormPanel() {
    }

    @And("Vul in de “Inleiding“ form panel")
    public void vulInDeInleidingFormPanel() {
    }

    @And("Vul alles in de “Staal kaart“ form panel")
    public void vulAllesInDeStaalKaartFormPanel() {
    }

    @And("Vul in de “Algemeen“ form panel")
    public void vulInDeAlgemeenFormPanel() {
    }

    @And("In de “Betrokken partijen“ selecteer “Betrokken partijen“ en “Penvoerder“")
    public void inDeBetrokkenPartijenSelecteerBetrokkenPartijenEnPenvoerder() {
    }

    @And("Klik op “Bijlage“ vul en selecteer \\(csv pdf) alles in de “Bijlagen“ form panel")
    public void klikOpBijlageVulEnSelecteerCsvPdfAllesInDeBijlagenFormPanel() {
    }

    @And("Vul alles in de “Beoordeling“ tekst veld")
    public void vulAllesInDeBeoordelingTekstVeld() {
    }

    @And("Vul alles in de “Zie ook“ form panel")
    public void vulAllesInDeZieOokFormPanel() {
    }

    @And("Klik op “Bewaren“ en dan klik weer op “Bewaren en sluit“")
    public void klikOpBewarenEnDanKlikWeerOpBewarenEnSluit() {
    }

    @Then("Klik op de meetinstrument dat je gedaan heb bij recent section")
    public void klikOpDeMeetinstrumentDatJeGedaanHebBijRecentSection() {
    }

    @And("De meetinstrument concept pagina moet verschijnen.")
    public void deMeetinstrumentConceptPaginaMoetVerschijnen() {
    }
}
