package Page;

import Core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Classe base da página do formulário
public class FormPage extends BasePage {

    @FindBy(css = "#user_name")
    public WebElement userName;

    @FindBy(css = "#user_lastname")
    public WebElement userLastName;

    @FindBy(css = "#user_email")
    public WebElement userMail;

    @FindBy(css = "#user_address")
    public WebElement userAddress;

    @FindBy(css = "#user_university")
    public WebElement userUniversity;

    @FindBy(css = "#user_profile")
    public WebElement userProfile;

    @FindBy(css = "#user_gender")
    public WebElement userGender;

    @FindBy(css = "#user_age")
    public WebElement userAge;

    @FindBy(css = "input[value='Criar']")
    public WebElement createUser;

    @FindBy(css = "a.btn.waves-light.red")
    public WebElement back;

    @FindBy(css = "#notice")
    public WebElement notice;

    public FormPage(WebDriver driver) {
        super(driver);
    }
}
