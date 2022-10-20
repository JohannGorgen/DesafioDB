package Page;

import Core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

//Classe base da página de funções
public class FunctionPage extends BasePage {

    @FindBy(css = "a.collapsible-header")
    public List<WebElement> form;

    @FindBy(css = "a[href='/users/new']")
    public WebElement createUser;

    public FunctionPage(WebDriver driver) {
        super(driver);
    }
}
