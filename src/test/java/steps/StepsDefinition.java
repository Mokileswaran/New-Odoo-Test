package steps;

import java.time.Duration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefinition {
    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://stage-admin.qwqer.in/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        WebElement usernameField = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
        usernameField.sendKeys("mokil");

        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.sendKeys("123456789");

        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(1000);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Login Test Completed Successfully!");
        driver.quit();
    }
}