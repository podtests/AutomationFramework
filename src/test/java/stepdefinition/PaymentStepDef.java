package stepdefinition;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDef {

    @Before
    public void beforeScenario() {
        System.out.println("beforeScenario");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("beforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("afterStep");
    }


    @BeforeAll
    public static void before_all(){
        System.out.println("beforeAll");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }





    @After
    public void afterScenario() {
        System.out.println("afterScenario");
    }

    @Given("I am on Right page")
    public void i_am_on_right_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_am_on_right_page");
    }
    @When("I clicked on Pay Now")
    public void i_clicked_on_pay_now() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_clicked_on_pay_now");
    }
    @Then("payment should be made")
    public void payment_should_be_made() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("payment_should_be_made");
    }

}
