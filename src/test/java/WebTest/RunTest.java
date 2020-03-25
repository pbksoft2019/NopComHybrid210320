package WebTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@register", plugin = {"pretty","html:target/Destination"}, strict = true )

public class RunTest
{

}
