package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import suporte.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("http://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("cursos"),10);
        Assert.assertTrue(driver.findElement(By.id("cursos")).isDisplayed());
}
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(1000);
        //esperarElementoEstarPresente(By.id("email"),5);
    }

    public void preencherEmail(String email) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(email);
        esperarElementoEstarPresente(By.className("contact-text"),10);
        driver.findElement(By.className("contact-text")).click();

    }

    public void clickCupomDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificaCodigoDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("Mensagem correta!","QAZANDO15OFF", texto_cupom);
        System.out.println("Mensagem está correta!  " + texto_cupom);
    }
}


