package OrangeHRMScenarioHomeWork;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resources\\Features", tags="@login,~@LoginFailed",
        plugin = {"pretty", "html:target/cucumber-html-report"})

public class RunTest {

}
