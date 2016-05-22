package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainNavigation {
    public WebDriver driver;

    public MainNavigation(){
        driver = Hooks.driver;
    }

    @Given("^I open practiceselenium website$")
    public void step_1_impl(){
        driver.get("http://www.practiceselenium.com");
    }

    @When("^I click on menu Welcome$")
    public void clickWelcome(){
        driver.findElement(By.linkText("Welcome")).click();
    }

    @Then("^Welcome page link is correct$")
    public void welcomePageOk(){
        AssertJUnit.assertEquals("http://www.practiceselenium.com/welcome.html", driver.getCurrentUrl());
    }

    @When("^I click on menu Our Passion$")
    public void clickOurPassion(){
        driver.findElement(By.linkText("Our Passion")).click();
    }

    @Then("^Our Passion page link is correct$")
    public void ourPassionOk(){
        AssertJUnit.assertEquals("http://www.practiceselenium.com/our-passion.html", driver.getCurrentUrl());
    }

    @When("^I click on menu Menu$")
    public void clickMenu(){
        driver.findElement(By.linkText("Menu")).click();
    }

    @Then("^Menu page link is correct$")
    public void menuOk(){
        AssertJUnit.assertEquals("http://www.practiceselenium.com/menu.html", driver.getCurrentUrl());
    }

    @When("^I click on menu Let's Talk Tea$")
    public void clickLetsTalkTea(){
        driver.findElement(By.linkText("Let's Talk Tea")).click();
    }

    @Then("^Let's Talk Tea page link is correct$")
    public void letsTalkTeaOk(){
        AssertJUnit.assertEquals("http://www.practiceselenium.com/let-s-talk-tea.html", driver.getCurrentUrl());
    }

    @When("^I click on menu Check Out$")
    public void clickCheckOut(){
        driver.findElement(By.linkText("Check Out")).click();
    }

    @Then("^Check Out page link is correct$")
    public void CheckOutOk(){
        AssertJUnit.assertEquals("http://www.practiceselenium.com/check-out.html", driver.getCurrentUrl());
    }

}
