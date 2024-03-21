package testsChronos;


import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {
    LoginPage loginPage;

    @AndroidFindBy(accessibility = "conhecaTodosOsNossoCursos")
    public WebElement txtTituloProdutos;

    @Test
    public void imprimirNoConsole(){
        System.out.println("Primeiro teste!");
    }

    @Test
    public void realizarLoginValido() throws MalformedURLException {
        Driver.inicializaDriver();
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
        loginPage = new LoginPage();

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        assertEquals("Conheça todos os nossos cursos", getTextTituloProdutos());

    }

    public String getTextTituloProdutos(){
        return txtTituloProdutos.getText();
    }


}
