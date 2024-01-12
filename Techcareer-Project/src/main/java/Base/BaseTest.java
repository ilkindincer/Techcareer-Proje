package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Data {
    public static WebDriver driver;

    @BeforeClass
    public static void beforeTest() {

        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
            WebDriverManager.chromedriver().setup();
        }

        driver.get("https://www.mimandmore.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }
}
