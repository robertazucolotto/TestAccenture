package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class OpcaoDePreco {

	Iteracoes i = new Iteracoes();
	
	// Elementos da p�gina com as Op��es de Pre�o
	private By priceOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	private By btnNext = By.id("nextsendquote");
	
	// M�todos de escolha do pre�o
	public void escolherOpcaoDePreco() {
		i.clicar(priceOption);
	}
	
	public void clicarEmNext() {
		i.clicar(btnNext);
	}
}
