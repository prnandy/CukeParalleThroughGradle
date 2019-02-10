package com.discover.paymentgateways.StepDefinations;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStep {

	private User user = new User();
	int result=0;
	/* Given that the user Vinod enter two number for calculation */
	@Given("^that the user Vinod enter two number for (.*)$")
	public void name(String name) throws Throwable {
		user.setName(name);
	}
	
	/*When Vinod enters 10,5 for addition operation*/
	@When("^Vinod enters (.*),(.*) for (.*)$")
	public void operation(String m1, String m2, String oper) throws Throwable {
		int marks1 = Integer.parseInt(m1);
		int marks2 = Integer.parseInt(m2);
		user.setCertification(oper);
		if(user.getCertification().equals("addition")) {
			result = marks1+marks2;
		}else if(user.getCertification().equals("subtraction")) {
			result = marks1-marks2;
		}else if(user.getCertification().equals("multiplication")) {
			result = marks1*marks2;
		}else if(user.getCertification().equals("division")) {
			result = marks1/marks2;
		}
	}

	/* Then Vinod found result is 15 */
	@Then("^Vinod found result is (.*)$")
	public void finalResult(int fresult) throws Throwable {
		if(user.getCertification().equals("addition")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("subtraction")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("multiplication")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("division")) {
			assertEquals(result, fresult);
		}
	}
}
