package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/comprar.feature",
        glue = "stepdefinitions",
        tags = "@SAUCE2",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ComprarRunner {
}
