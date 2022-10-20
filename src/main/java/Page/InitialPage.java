package Page;

import Core.BasePage;
import Core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//Classe base da página inicial
public class InitialPage extends BasePage {

    @FindBy(css = "a.btn.waves-light.orange")
    public List<WebElement> webAutomation;

    public WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), 10);

    public InitialPage(WebDriver driver) {
        super(driver);
    }
}
