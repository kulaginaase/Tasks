package yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(css = "input.Textinput-Control")
    private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(css = "button.Button2.Button2_size_l.Button2_view_action.Button2_width_max.Button2_type_submit")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(className = "Textinput-Control")
    private WebElement passwdField;
    /**
     * метод для ввода логина
     */

    @FindBy(id = "field:input-passwd:hint")
    private WebElement warning;


    public void inputLogin(String login) {
        loginField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void clickLoginBtn() {
        loginBtn.click(); }
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickPassBtn() {
        loginBtn.click(); }

public String getWarning() {
        return warning.getText();
}

}
