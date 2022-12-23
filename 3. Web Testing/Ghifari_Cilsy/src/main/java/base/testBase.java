package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.TestUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class testBase {

    public static WebDriver driver;
    public static Properties properties;

    public testBase() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/config/config.properties");
            properties.load(inputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void initialization() throws InterruptedException {


        ChromeOptions chrome_options = new ChromeOptions();

        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");

        //   chrome://version/  --> Jalur Profile
        chrome_options.addArguments("user-data-dir=C:\\Users\\SCC1201902070\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\default");
        chrome_options.addArguments("--profile-directory=default");

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver(chrome_options);
        driver.manage().window().maximize();

        //  driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));

        WebElement btnTeam = driver.findElement(By.xpath("//*[contains(text(),'POC')]"));
        Thread.sleep(3000);
        btnTeam.click();
        Thread.sleep(3000);
}}
