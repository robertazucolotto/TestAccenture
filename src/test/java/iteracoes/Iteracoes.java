package iteracoes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iteracoes {
	public static WebDriver driver;
	
	public void abrirUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/Windows/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void aguardar(int tempo) {
		driver.manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	public void selecionarCombo(By elemento, String valor) {
		Select selecionar = new Select(driver.findElement(elemento));
		selecionar.selectByValue(valor);;
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String valor) {
		driver.findElement(elemento).sendKeys(valor);
	}

	public String obterTexto(By elemento) {
		return driver.findElement(elemento).getText();
	}
}

