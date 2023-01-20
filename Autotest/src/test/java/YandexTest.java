import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YandexTest {
    /**
     * 1) Нашел отличный пример с проектом. Нужно взять статью и как написано в статье собрать проект и написать автотест,
     * который разобран в примере.  https://habr.com/ru/post/502292/
     * 2) Теперь закрепим что узнали. На основе проекта в п1 разработаем собсвенный автотест.
     * Сценарий такой:
     * Открыть главную страницу https://tramontana.ru/
     * Перейти в раздел «Альпинизм»
     * Перейти в раздел «Оттяжки»
     * У товарной карточки «УДОЧКА ДЛЯ ВСТЕГИВАНИЯ ОТТЯЖЕК KAILAS CLIP UP III» - проверить прайс.
     */


    public static WebDriver driver = new ChromeDriver();
    @BeforeClass
  public static void setUp() {

System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://passport.yandex.ru/auth"); - равносильно
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() {
        var wrongLogin = "wrongLogin";
        var enterButton = By.className("Button2.Button2_size_l.Button2_view_action.Button2_width_max.Button2_type_submit");
        var login = By.className("Textinput-Control");
        driver.findElement(login).sendKeys(wrongLogin);

    }


}
