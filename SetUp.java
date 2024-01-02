import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUp {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}
