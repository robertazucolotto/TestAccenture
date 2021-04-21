package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class DadosDoProduto {

	Iteracoes i = new Iteracoes();

	// Elementos da página Dados do Produto
	private By startDate = By.id("startdate");
	private By insuranceSum = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damageInsurance = By.id("damageinsurance");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	private By courtesyCar = By.id("courtesycar");
	private By btnNext = By.id("nextselectpriceoption");

	// Métodos para preencher os campos dos Dados do Produto
	public void preencherOsDadosDoProduto() {
		i.escrever(startDate, "11/11/2021");
		i.selecionarCombo(insuranceSum, "3000000");
		i.selecionarCombo(meritRating, "Bonus 2");
		i.selecionarCombo(damageInsurance, "No Coverage");
		i.clicar(optionalProducts);
		i.selecionarCombo(courtesyCar, "Yes");
	}

	public void clicarEmNext() {
		i.clicar(btnNext);
	}
}
