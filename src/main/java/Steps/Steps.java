package Steps;

import Page.FormPage;
import Page.FunctionPage;
import Page.InitialPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

//Classe dos passos a passos
public class Steps {

    private InitialPage initialpage;
    private FunctionPage functionpage;
    private FormPage formpage;

    public Steps(WebDriver driver) {
        initialpage = new InitialPage(driver);
        functionpage = new FunctionPage(driver);
        formpage = new FormPage(driver);
    }

    @Step ("Dado que eu acesse a página de automação web")
    public Steps automationAccess(int index) {
        initialpage.wait.until(ExpectedConditions.elementToBeClickable(initialpage.webAutomation.get(index)));
        initialpage.webAutomation.get(index).click();
        return this;
    }

    @Step ("E que eu acesse a página de fomrulário")
    public Steps formAccess(int index) {
        initialpage.wait.until(ExpectedConditions.elementToBeClickable(functionpage.form.get(index)));
        functionpage.form.get(index).click();
        initialpage.wait.until(ExpectedConditions.elementToBeClickable(functionpage.createUser));
        functionpage.createUser.click();
        return this;
    }

    @Step ("Quando eu preencho o formulário com as informações")
    public Steps fillForm(String firstName, String lastName, String mail, String adress, String university, String profile, String gender, String age) {
        initialpage.wait.until(ExpectedConditions.elementToBeClickable(formpage.createUser));
        formpage.userName.sendKeys(firstName);
        formpage.userLastName.sendKeys(lastName);
        formpage.userMail.sendKeys(mail);
        formpage.userAddress.sendKeys(adress);
        formpage.userUniversity.sendKeys(university);
        formpage.userProfile.sendKeys(profile);
        formpage.userGender.sendKeys(gender);
        formpage.userAge.sendKeys(age);
        formpage.createUser.click();
        return this;
    }

    @Step ("Então verifico se o cadastro foi realizado")
    public Steps verifyUser() {
        initialpage.wait.until(ExpectedConditions.elementToBeClickable(formpage.notice));
        Assert.assertEquals("Usuário Criado com sucesso",formpage.notice.getText());
        return this;
    }


}
