package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\rinal\\IdeaProjects\\CucumberBddFramework\\src\\test\\java\\Feature\\Register.feature",
     //   features = ".", tags = "@E2E", // with one tag
        // features = ".", tags = {"@Login", "@Smoke"},//And //Both
        // features = ".", tags = {"@Login, @Regression"}, // or
    //    features = ".", tags = {"~@Login"}, //Ignore tags
        glue = {"StepDefinition"},
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = false // to check mapping proper between feature file and step definition
        // monochrome = false, // display the output on proper manner or readable format of console output
        // strict = true // it will check if any step is not defined in step definitions file

)



public class TestRunner {
}
