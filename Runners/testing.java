package Burak_Test.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Burak_Test/FeatureFiles"},
        /* glue = {"Burak_Test.StepDefinitions"}, */
        extraGlue = {"Burak_Test.Generiek.Generiek_Pagesp"}
)
public class testing extends AbstractTestNGCucumberTests {
}
