package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosSteps extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("que estou no site da qazando")
    public void acessar_site_qazando() {
        homePage.acessarAplicacao();

    }
    @Quando("eu preencho meu email")
    public void eu_preencho_meu_email() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail("rafaelsalese.e@gmail.com");

    }

    @E("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() throws InterruptedException {
        homePage.clickCupomDesconto();
    }

    @Entao("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() throws InterruptedException {
        homePage.verificaCodigoDesconto();

    }

}
