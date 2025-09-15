package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class StepDefinitions {
    WebDriver driver;
    LoginPage loginPage;
    SalesPage salesPage;
    AccountingPage accountingPage;
    SettingsPage settingsPage;

    @Given("I open the Odoo login page")
    public void i_open_the_odoo_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devbeta-erp.qwqer.in/web/login#cids=1");
    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        loginPage = new LoginPage(driver);
        loginPage.login("mokileswaran.p@qwysoft.com", "m");
    }

    @Then("I navigate to Sales and view Quotations list")
    public void i_navigate_to_sales_and_view_quotations_list() throws InterruptedException {
        SalesPage salesPage = new SalesPage(driver);
        salesPage.goToQuotations();
    }

    @And("I navigate to Accounting and view Invoices list")
    public void i_navigate_to_accounting_and_view_invoices_list() throws InterruptedException {
        SalesPage salesPage = new SalesPage(driver);
        salesPage.reopenMenu(); // open app switcher again
        AccountingPage accountingPage = new AccountingPage(driver);
        accountingPage.goToInvoices();
    }
    @Then("I navigate to Settings and view API logs")
    public void i_navigate_to_settings_and_view_api_logs() throws InterruptedException {
        settingsPage = new SettingsPage(driver);
        settingsPage.goToApiLogs();
        driver.quit();
    }
}
