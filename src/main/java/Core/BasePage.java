package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Classe base das páginas
public class BasePage {

    public BasePage(WebDriver driver){
        PageFactory.initElements(BaseTest.getDriver(),this);
    }
}
