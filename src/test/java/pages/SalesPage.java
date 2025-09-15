package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesPage {
    WebDriver driver;


    By menuToggle = By.xpath("//i[@class='oi oi-apps']");
    By salesMenu = By.xpath("//div[contains(text(),'Sales')]");

    public SalesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void goToQuotations() throws InterruptedException {
        driver.findElement(menuToggle).click();
        Thread.sleep(4000); // wait 2 seconds
        driver.findElement(salesMenu).click();
        Thread.sleep(4000);
    }

    public void reopenMenu() throws InterruptedException {
        driver.findElement(menuToggle).click();
        Thread.sleep(4000);
    }
}
