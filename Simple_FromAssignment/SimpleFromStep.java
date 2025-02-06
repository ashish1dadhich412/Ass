package SetepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFromStep {
	  WebDriver driver;

	    @Given("I open the simple form page")
	    public void i_open_the_simple_form_page() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://v1.training-support.net/selenium/simple-form");
	    }

	    @When("I enter {string} into the first name field")
	    public void i_enter_first_name(String firstName) {
	        WebElement firstNameField = driver.findElement(By.id("firstName"));
	        firstNameField.sendKeys(firstName);
	    }

	    @When("I enter {string} into the last name field")
	    public void i_enter_last_name(String lastName) {
	        WebElement lastNameField = driver.findElement(By.id("lastName"));
	        lastNameField.sendKeys(lastName);
	    }

	    @When("I enter {string} into the email field")
	    public void i_enter_email(String email) {
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys(email);
	    }

	    @When("I enter {string} into the contact number field")
	    public void i_enter_contact_number(String contactNumber) {
	        WebElement contactField = driver.findElement(By.id("contactNumber"));
	        contactField.sendKeys(contactNumber);
	    }

	    @When("I enter {string} into the message field")
	    public void i_enter_message(String message) {
	        WebElement messageField = driver.findElement(By.id("message"));
	        messageField.sendKeys(message);
	    }

	    @When("I click the submit button")
	    public void i_click_the_submit_button() {
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        submitButton.click();
	    }

	    @Then("I should see {string} displayed in the result")
	    public void i_should_see_first_name_displayed_in_the_result(String expectedFirstName) {
	        WebElement result = driver.findElement(By.id("result"));
	        assertEquals(result.getText(), expectedFirstName);
	    }

	    @Then("I should see {string} displayed in the result")
	    public void i_should_see_last_name_displayed_in_the_result(String expectedLastName) {
	        WebElement result = driver.findElement(By.id("result"));
	        assertEquals(result.getText(), expectedLastName);
	    }

	    @Then("I should see {string} displayed in the result")
	    public void i_should_see_email_displayed_in_the_result(String expectedEmail) {
	        WebElement result = driver.findElement(By.id("result"));
	        assertEquals(result.getText(), expectedEmail);
	    }

	    @Then("I should see {string} displayed in the result")
	    public void i_should_see_contact_number_displayed_in_the_result(String expectedContactNumber) {
	        WebElement result = driver.findElement(By.id("result"));
	        assertEquals(result.getText(), expectedContactNumber);
	    }

	    @Then("I should see {string} displayed in the result")
	    public void i_should_see_message_displayed_in_the_result(String expectedMessage) {
	        WebElement result = driver.findElement(By.id("result"));
	        assertEquals(result.getText(), expectedMessage);
	        driver.quit();
	    }

}
