package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json","html:target/reports/"}, //configuração para relatório Junit;
        features = "classpath:features",
        tags = {"@cadastro-sucesso"},
        glue = {"steps"}
)
public class RunCucumberTest {

    public static WebDriver driver;

   @BeforeClass
    public static void  start(){
        driver = new ChromeDriver();

    }
    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
