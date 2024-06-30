package Tests;
import Pages.HerokuContextPage;
import Pages.HerokuDynamicControlsPage;
import Pages.HerokuFramesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public HerokuContextPage herokuContextPage;
    public HerokuFramesPage herokuFramesPage;
    public HerokuDynamicControlsPage herokuDynamicControlsPage;

    @BeforeMethod()
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        herokuContextPage = new HerokuContextPage(driver);
        herokuFramesPage = new HerokuFramesPage(driver);
        herokuDynamicControlsPage = new HerokuDynamicControlsPage(driver);

    }
       @AfterMethod(alwaysRun = true)
        public void close() {
            driver.quit();
        }
    }