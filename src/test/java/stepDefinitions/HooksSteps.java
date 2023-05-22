package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksSteps {

    @Before
    public void beforeAny() {
        System.out.println(" Start Scenario: " + Scenario.class.getName());
    }

    @After
    public void afterAny() {
        System.out.println(" End of Scenario: " + Scenario.class.getName());
    }

}
