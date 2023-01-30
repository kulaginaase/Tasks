package tramontana;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;


/**
 * Открыть главную страницу https://tramontana.ru/
 * Перейти в раздел «Альпинизм»
 * Перейти в раздел «Оттяжки»
 * У товарной карточки «УДОЧКА ДЛЯ ВСТЕГИВАНИЯ ОТТЯЖЕК KAILAS CLIP UP III» - проверить прайс.
 */

public class tramontanaTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        driver.navigate().to("https://tramontana.ru/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() throws IOException {
        driver.quit();
    }

    @Test
    public void priceTest() {

        var alpinizm = By.cssSelector("ul.navbar-nav > li:nth-of-type(4)");
        driver.findElement(alpinizm).click();

        var ottyazhki = driver.findElement(By.cssSelector("div.filter-1>div>div.filter-accordion__item:nth-of-type(10)"));
        jse.executeScript("arguments[0].scrollIntoView();", ottyazhki);
        ottyazhki.click();

        var brandButton = By.cssSelector("form.smartfilter > div:nth-of-type(1)");
        driver.findElement(brandButton).click();

        var kailasCheckBox = By.xpath("//span[@title='Kailas']");
        driver.findElement(kailasCheckBox).click();

        var productsList = By.cssSelector("div.row>div.col-6:nth-of-type(2)");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(productsList));

        var productCard = By.cssSelector("a.card__img>img");
        driver.findElement(productCard).click();

        var priceElement = driver.findElement(By.cssSelector("span.product-card__price"));
        var exceptedPrice = "4 950 ₽";
        var actualPrice = priceElement.getText();

        Assert.assertEquals("Стоимость товара не соответствует ожидаемому результату",
                exceptedPrice, actualPrice);
    }
}
