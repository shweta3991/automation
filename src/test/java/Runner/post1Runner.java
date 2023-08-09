package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature/post1.feature"}, glue = {"Steps"},
        //plugin = {"pretty","html:target/HtmlReports"})
        //plugin = {"pretty","json:target/report.json"})
        //plugin = {"pretty","junit:target/report.xml"},tags = "@SmokeTest")
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports"})
//tags = {"@smoke","@regression"})
public class post1Runner {

}
