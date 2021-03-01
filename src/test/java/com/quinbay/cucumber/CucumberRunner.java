package com.quinbay.cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/**
 * @author kumar on 12/01/21
 * @project X-search
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json","pretty", "html:target/cucumber/report.html"},
        tags = "@Sanity",
        glue = {"com.quinbay.cucumber"},
        features = "src/test/resources/features"
)
public class CucumberRunner {}