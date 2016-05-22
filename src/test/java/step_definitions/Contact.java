package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import java.util.concurrent.TimeUnit;

public class Contact {

    public WebDriver driver;

    public Contact(){
        driver = Hooks.driver;
    }

    @Given("^I open contact page$")
    public void step_1_impl(){
        driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
    }

    @And("^I fill the form with values$")
    public void step_2_impl(){
        driver.findElement(By.name("name")).sendKeys("Doni");
        driver.findElement(By.name("email")).sendKeys("test@example.com");
        driver.findElement(By.name("subject")).sendKeys("test");
        driver.findElement(By.name("message")).sendKeys("message");
    }

    @And("^I hit submit button$")
    public void step_3_impl(){
        driver.findElement(By.className("form-submit")).click();
    }

    @Then("^Thank you message appear$")
    public void step_4_impl() throws Throwable {
        Timeouts timeouts = driver.manage().timeouts();
        timeouts.implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait waiter = new WebDriverWait(driver, 10);
        WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-message")));
        AssertJUnit.assertEquals(" Thank you sending us your information. We will get back to you with your Chai :) ", element.getAttribute("innerHTML"));
    }
}
