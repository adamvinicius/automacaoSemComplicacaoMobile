package testsChronos;


import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {
    LoginPage loginPage;
    ProdutosPage produtosPage;

    @BeforeEach
    public void inicializaTesteLogin() throws MalformedURLException {
        Driver.inicializaDriver();

        loginPage = new LoginPage();
    }

    @Test
    public void imprimirNoConsole(){
        System.out.println("Primeiro teste!");
    }

    @Test
    public void realizarLoginValido(){
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());

    }

    @Test
    public void realizarLoginEmailInvalido(){
        loginPage.realizarLogin("teste", "123456");

        assertEquals("O email não é válido.", loginPage.getTxtEmailError());
    }




}
