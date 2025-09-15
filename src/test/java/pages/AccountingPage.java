package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountingPage {
    WebDriver driver;

    By accountingMenu = By.xpath("//a[contains(text(),'Accounting')]");
    By customerMenu = By.xpath("//a[contains(text(),'Customers')]");
    By invoicesMenu = By.xpath("//a[contains(text(),'Invoices')]");

    public AccountingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToInvoices() throws InterruptedException {
        driver.findElement(accountingMenu).click();
        Thread.sleep(2000);
        driver.findElement(customerMenu).click();
        Thread.sleep(1000);
        driver.findElement(invoicesMenu).click();
        Thread.sleep(2000);
    }
}
