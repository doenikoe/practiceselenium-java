package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOut {

    public WebDriver driver;

    public CheckOut(){
        driver = Hooks.driver;
    }

    @Given("^I open check out form$")
    public void step_1_impl(){
        driver.get("http://www.practiceselenium.com/check-out.html");
    }

    @When("^I hit place order button without entered any information$")
    public void step_2_impl(){
        driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
    }

    @Then("^I unable to submit the form and I still at the same page$")
    public void step_3_impl(){
        AssertJUnit.assertEquals("Check Out", driver.getTitle());
    }
}
