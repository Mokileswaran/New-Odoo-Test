package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesPage {
    WebDriver driver;

    By menuToggle = By.xpath("//i[@class=\"oi oi-apps\"]");
    //By menuToggle = By.xpath("//i[@class=\"oi oi-apps\"] or contains(@class,'o_appswitcher')]");
    By salesMenu = By.xpath("//a[@role='menuitem']//span[contains(text(),'Sales')]");
    By quotations = By.xpath("//a[@role='menuitem']//span[contains(text(),'Quotations')]");

    public SalesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToQuotations() throws InterruptedException {
        driver.findElement(menuToggle).click();
        Thread.sleep(2000); // wait 2 seconds
        driver.findElement(salesMenu).click();
        Thread.sleep(2000); // wait 2 seconds
        driver.findElement(quotations).click();
        Thread.sleep(2000); // wait 2 seconds
    }
}