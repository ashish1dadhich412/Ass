package runners;



import org.testng.annotations.*;

import SetepDefinition.SimpleFromStep;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
    features = "src\\test\\resources\\Features\\simple_form.feature",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class SimpleFromRunner extends SimpleFromStep {
}
