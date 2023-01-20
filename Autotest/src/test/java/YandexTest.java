import org.junit.*;
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

    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeClass
  public static void setUp() {


        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
        loginPage = new LoginPage(driver);

    }

//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }

    @Test
    public void loginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.clickLoginBtn();
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        var excepted = "Неверный пароль";
        var actual = loginPage.getWarning();
        Assert.assertEquals("Верификация не соответсвует ожидаемой", excepted, actual);
//        Assert.assertEquals("Верификация не соответсвует ожидаемой", "еверный пароль", loginPage.getWarning());


    }
//        var wrongLogin = "wrongLogin";
//        var enterButton = By.className("Button2.Button2_size_l.Button2_view_action.Button2_width_max.Button2_type_submit");
//        var login = By.className("Textinput-Control");
//        driver.findElement(login).sendKeys(wrongLogin);
// check warning - "field:input-passwd:hint" - Неверный пароль
//    }


}
