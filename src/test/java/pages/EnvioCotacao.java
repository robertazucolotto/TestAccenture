package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class EnvioCotacao {

	Iteracoes i = new Iteracoes();

	// Elementos da p�gina de Envio da Cota��o
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By sendEmail = By.id("sendemail");
	private By msgSucesso = By.xpath("/html/body/div[4]/h2");

	// M�todo para preencher os campos para envio de Cotacao
	public void preencherOsCamposParaEnvioDeCotacao() {
		i.escrever(email, "teste@gmail.com");
		i.escrever(phone, "11977444709");
		i.escrever(username, "roberta");
		i.escrever(password, "Teste123");
		i.escrever(confirmPassword, "Teste123");
		i.clicar(sendEmail);
	}

	// M�todo para valida��o da mensagem final
	public String validarMensagem() {
		i.aguardar(30);
		return i.obterTexto(msgSucesso);
	}
}
