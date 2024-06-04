package applicationCode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationCode {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public ApplicationCode() {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/chromedriver-mac-arm64/chromedriver");

        // Configure Chrome options (if needed)
        ChromeOptions options = new ChromeOptions();
        // You can add additional options here if required

        // Initialize ChromeDriver with options
        driver = new ChromeDriver(options);
    }

    // Method to navigate to the website
    public void navigateToWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    // Method to perform login
    public void login(String username, String password) {
        // Find username field and enter username
        driver.findElement(By.id("user-name")).sendKeys(username);
        // Find password field and enter password
        driver.findElement(By.id("password")).sendKeys(password);
        // Click on login button
        driver.findElement(By.id("login-button")).click();
    }

    // Method to perform logout
    public void logout() {
        // Click on the menu button
        driver.findElement(By.id("react-burger-menu-btn")).click();
        // Click on the logout link
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    // Method to close the WebDriver instance
    public void closeBrowser() {
        driver.quit();
    }

    // Example usage
    public static void main(String[] args) {
        ApplicationCode app = new ApplicationCode();
        app.navigateToWebsite();
        app.login("standard_user", "secret_sauce");
        // Perform other actions
        app.logout();
        app.closeBrowser();
    }
}

