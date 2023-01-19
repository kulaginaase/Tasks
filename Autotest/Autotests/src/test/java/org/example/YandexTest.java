package org.example;
import com.google.j2objc.annotations.Property;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.File;
import java.io.File;
import java.nio.file.Files;

import static java.time.Duration.ofSeconds;


public class YandexTest {
    /**
     * 1) Нашел отличный пример с проектом.
     * Нужно взять статью и как написано в статье собрать проект и написать автотест,
     * который разобран в примере.  https://habr.com/ru/post/502292/
     * 2) Теперь закрепим что узнали. На основе проекта в п1 разработаем собсвенный автотест.
     * Сценарий такой:
     * Открыть главную страницу https://tramontana.ru/
     * Перейти в раздел «Альпинизм»
     * Перейти в раздел «Оттяжки»
     * У товарной карточки «УДОЧКА ДЛЯ ВСТЕГИВАНИЯ ОТТЯЖЕК KAILAS CLIP UP III» - проверить прайс.
     */


    public static WebDriver driver;
    Actions builder = new Actions(driver);
    public static WebDriverWait wait;

    @Before
    public static void setUp() {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://intershop5.skillbox.ru/");
    }
    @After
    public static void tearDown() throws IOException {
        var sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        Files.copy(sourceFile, "screenshots/scrnsht.png");

//        FileUtils.
//        FileUtils.copyFile(sourceFile, new File("screenshots/scrnsht.png"));
        driver.quit();
    }





}
