package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class DadosDoSeguro {

	Iteracoes i = new Iteracoes();

	// Elementos da página Dados do Seguro
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By birthDate = By.id("birthdate");
	private By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By speeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	private By website = By.id("website");
	private By btnNext = By.id("nextenterproductdata");

	// Métodos para preencher os campos dos Dados do Seguro
	public void preencherOsDadosDoSeguro() {
		i.aguardar(10);
		i.escrever(firstName, "Roberta");
		i.escrever(lastName, "Zucolotto");
		i.escrever(birthDate, "11/27/1995");
		i.clicar(gender);
		i.escrever(streetAddress, "rua dos coqueirais, cotia sp");
		i.selecionarCombo(country, "Brazil");
		i.escrever(zipCode, "06719460");
		i.escrever(city, "Cotia");
		i.selecionarCombo(occupation, "Employee");
		i.clicar(speeding);
		i.escrever(website, "www.teste.com.br");
	}

	public void clicarEmNext() {
		i.clicar(btnNext);
	}
}
