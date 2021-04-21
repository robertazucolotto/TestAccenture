package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class OpcaoDePreco {

	Iteracoes i = new Iteracoes();
	
	// Elementos da página com as Opções de Preço
	private By priceOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	private By btnNext = By.id("nextsendquote");
	
	// Métodos de escolha do preço
	public void escolherOpcaoDePreco() {
		i.clicar(priceOption);
	}
	
	public void clicarEmNext() {
		i.clicar(btnNext);
	}
}
