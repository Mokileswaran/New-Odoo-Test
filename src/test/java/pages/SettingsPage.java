package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage {
    WebDriver driver;

    By settingsMenu = By.xpath("//a[contains(text(),'Settings')]");
    By technicalMenu = By.xpath("//a[contains(text(),'Technical')]");
    By apiLogsMenu = By.xpath("//a[contains(text(),'API Logs')]");

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToApiLogs() throws InterruptedException {
        driver.findElement(settingsMenu).click();
        Thread.sleep(2000);
        driver.findElement(technicalMenu).click();
        Thread.sleep(2000);
        driver.findElement(apiLogsMenu).click();
        Thread.sleep(2000);
    }
}
