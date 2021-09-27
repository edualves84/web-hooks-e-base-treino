package web;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class webSteps extends Base{


    Base base;

    public webSteps(Base base)

    {
        this.base = base;
    }

    @Given("^que acesso o mercado livre$")
    public void queAcessoOMercadoLivre() throws IOException {
        base.driver.get(base.url);

    }

    @When("^clico no campo de pesquisa e escrevo \"([^\"]*)\" e pressiono enter$")
    public void clicoNoCampoDePesquisaEEscrevoEPressionoEnter(String argh) {
         base.driver.findElement(By.className("nav-search-input")).sendKeys("caneta azul", Keys.ENTER);

    }

    @Then("^retorna lista de \"([^\"]*)\"$")
    public void retornaListaDe(String argh) {
        assertEquals("Caneta azul", base.driver.findElement(By.cssSelector("div.ui-search div.ui-search-main.ui-search-main--exhibitor.ui-search-main--only-products aside.ui-search-sidebar div.ui-search-breadcrumb > h1.ui-search-breadcrumb__title")).getText());

    }
}
