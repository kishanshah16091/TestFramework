package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        //features we use to provide the path of all the feature files
        features="src/test/resources/features/",
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
        monochrome = false,
        // tags will identify the scenario based on the tag we provide in the feature file
        // use or if we need to execute scenarios from logical or keyword which will execute either of the
        // scenario having the tag
        // use and if we need to execute scenarios from logical and keyword which will execure the senarios
        // having both the tags in it

        tags =  "@test",

        // plugin helps to write reports
        // we write multiple plugins inside { }
        // first one is html report that will be in our target folder
        // our reports will be maintained in the orange target folder
        // how ot open report: right click on cucumber.html click on open in--> browser -->> select any browser
        // pretty  adds the steps which we executed in the console -- complete step definition - connects scenario to the steps

        // json java script object notation--- a different language - for reporting - the colorful report
        // rerun  - will create a failed txt file
        // rerun-So if it failed because the site was overloaded from all the tests,
        // --> it will run it again to see if it runs the second time
        plugin= {
                "html:target/cucumber.html", "pretty", "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }

)

public class RunnerClass {

}
