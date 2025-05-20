package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

public class BookingsStepdefs {
    @Given("user navigates to bookings webpage")
    public void userNavigatesToBookingsWebpage() {
        System.out.println("hello");
    }

    @When("user requests booking id")
    public void userRequestsBookingId() {
        System.out.println("hello");
    }

    @Then("user receives the correct booking id")
    public void userReceivesTheCorrectBookingId() {
        System.out.println("hello");
    }
}
