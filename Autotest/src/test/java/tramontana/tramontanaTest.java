package tramontana;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class tramontanaTest {

    public static WebDriver driver;
    Actions builder = new Actions(driver);
    public static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://tramontana.ru/");
    }

    @AfterClass
    public static void tearDown() throws IOException {
        driver.quit();
    }

    @Test
    public void priceTest() {
        var price = new By.ByXPath("//html/body/div[2]/main/section/div/div/div[2]/div/div[3]/div/div[18]/div/div[2]/div[3]/span");
    }
}
