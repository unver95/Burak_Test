package Burak_Test.Generiek.Generiek_Pages;

import Burak_Test.Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generiek_GlobalNav {

    public Generiek_GlobalNav(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[title='Dashboard']")
    private WebElement dashboard;
    @FindBy(css = "[title='Persoonlijke ruimte']")
    private WebElement persoonlijkeRuimte;
    @FindBy(css = "[type=\"submit\"]")
    private WebElement submit;

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getPersoonlijkeRuimte() {
        return persoonlijkeRuimte;
    }

    public WebElement getSubmit() {
        return submit;
    }
}
