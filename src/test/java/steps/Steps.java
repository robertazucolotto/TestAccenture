package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DadosDoProduto;
import pages.DadosDoSeguro;
import pages.DadosDoVeiculo;
import pages.EnvioCotacao;
import pages.OpcaoDePreco;

public class Steps {
	
	private DadosDoVeiculo dadosDoVeiculo;
	private DadosDoSeguro dadosDoSeguro;
	private DadosDoProduto dadosDoProduto;
	private OpcaoDePreco opcaoDePreco;
	private EnvioCotacao envioCotacao;
	
	@Given("insiro os dados do veiculo")
	public void insiro_os_dados_do_veiculo() {
		dadosDoVeiculo = new DadosDoVeiculo();
		dadosDoVeiculo.abrirUrl();
		dadosDoVeiculo.preencherOsDadosDoVeiculo();
	    dadosDoVeiculo.clicarEmNext();
	}

	@Given("insiro os dados do seguro")
	public void insiro_os_dados_do_seguro() {
		dadosDoSeguro = new DadosDoSeguro();
		dadosDoSeguro.preencherOsDadosDoSeguro();
		dadosDoSeguro.clicarEmNext();
	}

	@When("insiro os dados do produto")
	public void insiro_os_dados_do_produto() {
		dadosDoProduto = new DadosDoProduto();
		dadosDoProduto.preencherOsDadosDoProduto();
		dadosDoProduto.clicarEmNext();
	}

	@When("seleciono a opcao de preco")
	public void seleciono_a_opcao_de_preco() {
		opcaoDePreco = new OpcaoDePreco();
		opcaoDePreco.escolherOpcaoDePreco();
		opcaoDePreco.clicarEmNext();
	}

	@Then("envio a cotacao")
	public void envio_a_cotacao() {
		envioCotacao = new EnvioCotacao();
		envioCotacao.preencherOsCamposParaEnvioDeCotacao();
		assertEquals("Sending e-mail success!", envioCotacao.validarMensagem());
	}
	
	@Then("a cotacao e enviada com sucesso")
	public void a_cotacao_e_enviada_com_sucesso() {
		assertEquals("Sending e-mail success!", envioCotacao.validarMensagem());
	}
}
