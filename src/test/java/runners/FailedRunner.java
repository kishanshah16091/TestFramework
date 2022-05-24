package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        // its not using any feature file its only will be running @target
        features="@target/failed.txt",
        // glue is where we find implementation for gherkin steps
        // we provide the path of package to get all the step definitions
        glue = "steps",
        // dryRun we use to get the step definition of undefined steps
        // if we set it to true, it will quickly scan all gherkin steps whether they are implemented or not
        // if we set it to true, it stops actual execution
        // to execute scripts in real time, we should set this value to false
        dryRun = false,
        // it means the console output for cucumber test is having irrelevant information
        // when we set it to true, it simply removes all irrelevant information
        monochrome = true,
        // tags will identify the scenario based on the tag we provide in the feature file
        // use or if we need to execute scenarios from logical or keyword which will execute either of the
        // scenario having the tag
        // use and if we need to execute scenarios from logical and keyword which will execure the senarios
        // having both the tags in it


        // plugin helps to write reports
        // we write multiple plugins inside { }
        // first one is html report that will be in our target folder
        // our reports will be maintained in the orange target folder
        // how ot open report: right click on cucumber.html click on open in--> browser -->> select any browser
        // pretty  adds the steps which we executed in the console -- complete step definition

        // json java script object notation a different language - for reporting
        // rerun  - will create a failed txt file
        plugin= {
                "pretty",
        }

)



public class FailedRunner {
}
