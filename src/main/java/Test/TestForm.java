package Test;

import Core.BaseTest;
import Steps.Steps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import jdk.jfr.Category;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Classe de execução do teste
public class TestForm extends BaseTest {

    private Steps steps;

    @BeforeTest
    public void initialize() {
        steps = new Steps(getDriver());
    }

    @Epic("Cadastro")
    @Test(priority = 1)
    @Story("Cadastro de usuário")
    @Description("Cadastra um usuário com todos os dados")
    public void createUser() {
        getDriver().navigate().to("https://automacaocombatista.herokuapp.com/home/index");
        steps.automationAccess(0);
        steps.formAccess(0);
        steps.fillForm("João","da Silva","joao_da_silva@gmail.com" ,"rua São Paulo, n 100", "USP", "Médico","Masculino", "25");
        steps.verifyUser();
    }

    @Epic("Cadastro")
    @Test(priority = 2)
    @Story("Cadastro de usuário")
    @Description("Cadastra um usuário com dados mínimos requeridos")
    public void createUserWithMinimumRequirement() {
        getDriver().navigate().to("https://automacaocombatista.herokuapp.com/home/index");
        steps.automationAccess(0);
        steps.formAccess(0);
        steps.fillForm("Mario","Rodrigues","mario_riodrigues@gmail.com" ,"", "", "","", "");
        steps.verifyUser();
    }

}
