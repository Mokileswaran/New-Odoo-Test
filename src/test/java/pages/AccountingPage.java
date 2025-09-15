package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountingPage {
    WebDriver driver;

    // Menu Toggle button (apps icon)
    By menuToggle = By.xpath("//i[@class='oi oi-apps']");
    By accountingMenu = By.xpath("//div[contains(text(),'Accounting')]");
    By customersMenu = By.xpath("//*[contains(text(),'Customers')]");
    By invoicesMenu = By.xpath("//*[contains(text(),'Invoices')]");

    public AccountingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to reopen the main app menu
    public void reopenMenu() throws InterruptedException {
        driver.findElement(menuToggle).click();
        Thread.sleep(3000); // wait 2 sec
    }

    // Method to go to Invoices list
    public void goToInvoices() throws InterruptedException {
        // First click Accounting
        driver.findElement(accountingMenu).click();
        Thread.sleep(3000); // wait 3 sec to load sidebar


        // Click Customers
        driver.findElement(customersMenu).click();
        Thread.sleep(3000);

        // Click Invoices
        driver.findElement(invoicesMenu).click();
        Thread.sleep(3000);
    }
}
