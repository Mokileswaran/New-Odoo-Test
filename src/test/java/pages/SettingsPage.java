package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage {
    WebDriver driver;

    // App Switcher icon
    By menuToggle = By.xpath("//i[@class='oi oi-apps']");
    By settingsMenu = By.xpath("//div[contains(text(),'Settings')]");
    By technicalMenu = By.xpath("//a[contains(text(),'Technical')]");
    By apiLogsMenu = By.xpath("//a[contains(text(),'API Logs')]");

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void reopenMenu() throws InterruptedException {
        driver.findElement(menuToggle).click();
        Thread.sleep(3000); // wait 2 sec
    }

    public void goToApiLogs() throws InterruptedException {
        driver.findElement(settingsMenu).click();
        Thread.sleep(3000); // wait 3 sec so settings page loads fully

        driver.findElement(technicalMenu).click();
        Thread.sleep(3000);

        driver.findElement(apiLogsMenu).click();
        Thread.sleep(3000);
    }
}
