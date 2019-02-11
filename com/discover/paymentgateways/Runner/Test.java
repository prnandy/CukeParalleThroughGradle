package com.discover.paymentgateways.Runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        outputFolder = "target",
        retryCount = 3)
@CucumberOptions(
		 features = "src/test/java/functionalTest",
		 plugin = { "pretty", "html:target/cucumber-reports" ,
				 "json:target/cucumber.json",
			        "usage:target/cucumber-usage.json",},
		 tags= {"@All"},
		 monochrome = true
		 )
public class Test {
	
	 public static int retries = 0;
	    public Test() {
	    }
	    @RetryAcceptance
	    public static boolean retryCheck(Throwable e) {
	        // Does not allow re-run if error message contains "Configuration failed" phrase
	        return !e.getMessage().contains("Configuration failed");
	    }
}
*/



@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    features = {"classpath:com/discover/paymentgateways/features"},
    		//glue = "com/discover/paymentgateways/StepDefination/",
    plugin = {"pretty", "html:target/cucumber-reports",
              "json:target/cucumber.json",
              "rerun:target/rerun.txt"} //Creates a text file with failed scenarios
              ,tags = "@All"
          //  		  
            		  
           )
public class Test   {

}

