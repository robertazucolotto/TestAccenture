package execute;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import iteracoes.Iteracoes;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = { "" }, tags = "@EnvioFormTricentis")

public class RunnerTest {
	
	   protected static WebDriver driver;

	    @AfterClass
	    public static void closeBrowser() {
	        Iteracoes.driver.close();
	    }
}
